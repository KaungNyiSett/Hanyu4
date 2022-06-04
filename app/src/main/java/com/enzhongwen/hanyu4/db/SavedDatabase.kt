package com.enzhongwen.hanyu4.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [VocabData::class], version = 3, exportSchema = false)
abstract class SavedDatabase: RoomDatabase() {

    abstract fun savedDao(): SavedDao

    companion object{
        @Volatile
        private var INSTANCE: SavedDatabase? = null

        fun getDatabase(context: Context): SavedDatabase{
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    SavedDatabase::class.java,
                    "saved_database_4_1"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }

}