package com.enzhongwen.hanyu4.db

import androidx.annotation.DrawableRes
import androidx.annotation.RawRes
import androidx.annotation.StringRes
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.enzhongwen.hanyu4.R

@Entity(tableName = "saved_table_4_1")
data class VocabData(
    val word: String,
    val pinyin: String,
    @StringRes val definition: Int = R.string.app_name,
    @PrimaryKey(autoGenerate = false)
    val id1: Int = 331,
    @DrawableRes val stroke1: Int? = null,
    @DrawableRes val stroke2: Int? = null,
    @DrawableRes val stroke3: Int? = null,
    @DrawableRes val stroke4: Int? = null,
    @RawRes val sound: Int = 0,
    var saved: Boolean = false
)