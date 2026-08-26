package com.example.tapago.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.FitnessCenter
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(
    val label: String,
    val route: String,
    val icon: ImageVector,

)

val bottomNavItem= listOf(
    BottomNavItem(
        label = "Home",
        route = "HomeScreen",
        icon = Icons.Filled.Home
    ),BottomNavItem(
        label = "Começar",
        route = "ItemTreinoScreen/0",
        icon = Icons.Filled.PlayArrow
    ),
    BottomNavItem(
        label = "Treinos",
        route = "TreinoScreen",
        icon = Icons.Filled.FitnessCenter
    ),
    BottomNavItem(
       label = "Perfil",
        route = "PerfilScreen",
        icon = Icons.Filled.Person
    ),
)

