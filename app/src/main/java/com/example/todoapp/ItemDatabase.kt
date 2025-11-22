package com.example.todoapp

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.todoapp.converter.DateConverter
import com.example.todoapp.dao.ItemDao
import com.example.todoapp.entity.Item

@Database(
    entities = [Item::class],
    version = 1
)
@TypeConverters(DateConverter::class)
abstract class ItemDatabase: RoomDatabase() {

    abstract val dao: ItemDao
}