package com.enzhongwen.hanyu4.db

import androidx.lifecycle.LiveData

class SavedRepository(private val savedDao: SavedDao) {
    val readAllData: LiveData<MutableList<VocabData>> = savedDao.readAllData()

    suspend fun save(vocabData: VocabData){
        savedDao.save(vocabData)
    }

    suspend fun deleteAll(){
        savedDao.deleteAll()
    }

    suspend fun deleteItem(delete: VocabData){
        savedDao.deleteItem(delete)
    }

}