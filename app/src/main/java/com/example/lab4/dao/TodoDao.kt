package com.example.lab4.dao

import androidx.room.*
import com.example.lab4.model.Todo

@Dao
interface TodoDao{
    @Query("SELECT * FROM todo")
    fun getAll(): ArrayList<Todo>
    @Delete
    fun delete(todo: Todo)
    @Update
    fun update(todo:Todo)
    @Insert
    fun insert(todo: Todo): Long
}