package com.max_grank.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.max_grank.myapplication.about_screen.AboutScreen
import com.max_grank.myapplication.note_list_item_screen.NoteListScreen
import com.max_grank.myapplication.settings_screen.SettingsScreen
import com.max_grank.myapplication.shopping_list_item_screen.ShoppingListScreen
import com.max_grank.myapplication.utils.Routes

@Composable
fun NavGraph(
    navController: NavHostController,
    onNavigate: () -> Unit,
) {
    NavHost(
        navController,
        startDestination = Routes.SHOPPING_LIST) {
        composable(Routes.SHOPPING_LIST){ ShoppingListScreen() }
        composable(Routes.NOTE_LIST){ NoteListScreen() }
        composable(Routes.ABOUT){ AboutScreen() }
        composable(Routes.SETTINGS){ SettingsScreen() }
    }
}