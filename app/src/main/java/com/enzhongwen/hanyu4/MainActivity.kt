package com.enzhongwen.hanyu4

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.Observer
import androidx.navigation.compose.rememberNavController
import com.enzhongwen.hanyu4.db.SavedViewModel
import com.enzhongwen.hanyu4.db.VocabData
import com.google.accompanist.systemuicontroller.SystemUiController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.google.android.gms.ads.*
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

var FAV_LIST = mutableListOf<VocabData>()

const val BANNER_ID = "ca-app-pub-5467193675789833/1041765141"

const val INTERSTITIAL_ID = "ca-app-pub-5467193675789833/8687147415"

class MainActivity : ComponentActivity() {

    private val mSavedViewModel: SavedViewModel by viewModels()

    private lateinit var myPreference: MyPreference

    var mInterstitialAd: InterstitialAd? = null

    private val adRequest: AdRequest = AdRequest.Builder().build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mSavedViewModel.readAllData.observe(
            this
        ){
            FAV_LIST = it
        }

        MobileAds.initialize(this@MainActivity)

        setContent {
            val context = LocalContext.current

            var darkTheme by rememberSaveable {
                mutableStateOf(false)
            }

            val systemUiController: SystemUiController = rememberSystemUiController()
            systemUiController.setStatusBarColor(
                color = if (isSystemInDarkTheme()) {
                    if (darkTheme) {
                        Color.White
                    } else {
                        Color.Black
                    }
                } else {
                    if (darkTheme) {
                        Color.Black
                    } else {
                        Color.White
                    }
                }
            )
            systemUiController.setNavigationBarColor(
                color = if (isSystemInDarkTheme()) {
                    if (darkTheme) {
                        Color.White
                    } else {
                        Color.Black
                    }
                } else {
                    if (darkTheme) {
                        Color.Black
                    } else {
                        Color.White
                    }
                }
            )

            val navController = rememberNavController()

            InterstitialAd.load(
                context,
                INTERSTITIAL_ID,
                adRequest,
                object : InterstitialAdLoadCallback() {
                    override fun onAdFailedToLoad(adError: LoadAdError) {
                        Log.d("TAG", adError.message)
                        mInterstitialAd = null
                    }

                    override fun onAdLoaded(interstitialAd: InterstitialAd) {
                        Log.d("TAG", "Ad was loaded.")
                        mInterstitialAd = interstitialAd
                    }
                })

            NavGraph(
                navController = navController,
                endActivity = {
                    finish()
                },
                darkTheme = if (isSystemInDarkTheme()) {
                    !darkTheme
                } else {
                    darkTheme
                },
                darkMode = {
                    darkTheme = !darkTheme
                },
                onBack = {
                    mInterstitialAd?.show(this)
                }
            )

        }
    }

    override fun attachBaseContext(newBase: Context?) {
        myPreference = MyPreference(newBase!!)
        val lang = myPreference.getLoginCount()
        super.attachBaseContext(MyContextWrapper.wrap(newBase,lang!!))
    }
}

@Composable
fun BannerAd(
    modifier: Modifier = Modifier,
    adSize: AdSize = AdSize.BANNER,
) {
    AndroidView(
        factory = {
            AdView(it).apply {
                setAdSize(adSize)
                adUnitId = BANNER_ID
                loadAd(AdRequest.Builder().build())
            }
        },
        modifier = modifier
    )
}