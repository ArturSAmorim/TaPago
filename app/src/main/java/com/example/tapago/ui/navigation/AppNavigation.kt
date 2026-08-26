package com.example.tapago.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.tapago.ui.screen.HomeScreen
import com.example.tapago.ui.screen.ItemTreinoScreen
import com.example.tapago.ui.screen.ListaTreinoScreen
import com.example.tapago.ui.screen.PerfilScreen

@Composable
fun ConfiguracaoNav(){

    val navController = rememberNavController()

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    Scaffold(
        bottomBar = {
            if (currentRoute != "ItemTreinoScreen") {
                NavigationBar {
                    bottomNavItem.forEach { item ->
                        NavigationBarItem(
                            selected = currentRoute == item.route,
                            onClick = { navController.navigate(item.route){
                                launchSingleTop= true
                                restoreState=true
                            } },
                            icon = {
                                Icon(
                                    imageVector=item.icon,
                                    contentDescription=item.label
                                )},
                            label = { Text(item.label) }

                        )

                    }

                }
            }
        }
    ) {
        innerPadding ->
        NavHost(
            navController= navController,
            startDestination = "HomeScreen",
            modifier = Modifier.padding(innerPadding)
        ){
            composable("HomeScreen") {
                HomeScreen()
            }
            composable("TreinoScreen") {
                ListaTreinoScreen(onTreinoClick = { treino ->
                    navController.navigate("ItemTreinoScreen/${treino.id}")
                })
            }
            composable(
                route = "ItemTreinoScreen/{treinoId}",
                arguments = listOf(navArgument("treinoId") { type = NavType.IntType })
            ) { backStackEntry ->
                val id = backStackEntry.arguments?.getInt("treinoId") ?: 0
                ItemTreinoScreen(treinoId = id, onBackClick = { navController.popBackStack() })
            }
            composable("PerfilScreen") {
                PerfilScreen()
            }
        }





    }


}
