package com.example.tapago.ui.screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun ConfiguracaoNav(){

    val navController = rememberNavController()

    NavHost(
        navController=navController,
        startDestination = "ListaTreinoScreen"
    ){
        composable(route="ListaTreinoScreen"){
            ListaTreinoScreen(onTreinoClick = { treino ->
                navController.navigate("ItemTreinoScreen/${treino.id}")
            })
        }
        composable(
            route="ItemTreinoScreen/{treinoId}",
            arguments = listOf(navArgument("treinoId"){type= NavType.IntType})
        ){
            backStackEntry ->
            val id=backStackEntry.arguments?.getInt("treinoId")?:0

            ItemTreinoScreen(treinoId = id, onBackClick = {navController.popBackStack()})

        }

    }


}
