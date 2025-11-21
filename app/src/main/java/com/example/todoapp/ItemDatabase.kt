package com.example.todoapp

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.todoapp.dao.ItemDao
import com.example.todoapp.entity.Item

@Database(
    entities = [Item::class],
    version = 1
)
abstract class ItemDatabase: RoomDatabase() {

    abstract val dao: ItemDao
}