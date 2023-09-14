package com.example.bottomnavi.ui.theme.BottomNavigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigation(
    val name:String,
    val route:String,
    val icon:ImageVector
)
val BottomNavigations = listOf(
    BottomNavigation(
        name = "Settings",
        route = "Settings",
        icon = Icons.Default.Settings
    ),
    BottomNavigation(
        name = "Home",
        route = "Home",
        icon = Icons.Default.Home
    ),
    BottomNavigation(
        name = "Share",
        route = "Share",
        icon = Icons.Default.Share
    )
)