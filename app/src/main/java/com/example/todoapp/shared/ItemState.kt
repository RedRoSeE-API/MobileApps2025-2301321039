package com.example.todoapp.shared

import com.example.todoapp.entity.Item

data class ItemState (

    val items: List<Item> = emptyList(),
    val title: String = "",
    val description: String = "",
    val dueDate: String = "",
    val createdOn: String = "",
    val isAddingItem: Boolean = false,
    val sortType: SortTypes = SortTypes.TITLE
)