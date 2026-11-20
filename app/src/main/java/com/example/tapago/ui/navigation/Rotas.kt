package com.example.tapago.ui.navigation

object Rotas {
    const val HOME= "HomeScreen"
    const val TREINO= "TreinoScreen"

    const val PERFIL= "PerfilScreen"

    const val ITEM_TREINO = "ItemTreinoScreen/{treinoId}"

    const val START = "StartScreen"

    fun itemTreino(id: Int) = "ItemTreinoScreen/$id"
}