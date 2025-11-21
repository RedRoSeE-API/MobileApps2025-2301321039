package com.example.todoapp.event

import com.example.todoapp.entity.Item
import com.example.todoapp.shared.SortTypes


sealed interface ItemEvent {

    object SaveItem: ItemEvent

    object UpdateItem: ItemEvent

    data class SetTitle(val title: String): ItemEvent
    data class SetDescription(val description: String): ItemEvent
    data class SetDueDate(val dueDate: String): ItemEvent


    object ShowDialog: ItemEvent
    object HideDialog: ItemEvent

    data class SortItems(val sortType: SortTypes): ItemEvent
    data class DeleteItem(val item: Item): ItemEvent
}