package com.example.todoapp.nav

sealed class Screen(val route: String) {
    object ItemScreen : Screen("item_screen")
    object ItemViewScreen : Screen("item_view_screen")
}