package com.example.todoapp.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Item (

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val title: String,
    val description: String,
    val createdOn: String,
    val dueDate: String
)