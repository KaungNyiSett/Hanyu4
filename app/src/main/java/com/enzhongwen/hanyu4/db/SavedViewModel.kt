package com.enzhongwen.hanyu4.db

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SavedViewModel(application: Application): AndroidViewModel(application) {

    val readAllData: LiveData<MutableList<VocabData>>
    private val repository: SavedRepository

    init {
        val savedDao = SavedDatabase.getDatabase(application).savedDao()
        repository = SavedRepository(savedDao)
        readAllData = repository.readAllData
    }

    fun save(vocabData: VocabData) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.save(vocabData)
        }

    }

    fun deleteAll() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteAll()
        }
    }

    fun deleteItem(delete: VocabData) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteItem(delete)
        }
    }
}