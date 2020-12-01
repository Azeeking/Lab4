package com.example.lab4

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.lab4.dao.TodoDao
import com.example.lab4.model.Todo

@Database(
    entities = arrayOf(
        Todo::class
    ),version = 11
)
abstract class AppDatabase:RoomDatabase(){
    abstract fun TodoDao():TodoDao
}