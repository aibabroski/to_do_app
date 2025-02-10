package com.aibatech.todoapp.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import com.aibatech.todoapp.Todo

@Dao
interface TodoDao {
    fun getAllTodo(): LiveData<List<Todo>>

    fun addTodo(todo: Todo)

    fun deleteTodo(id: Int)

}