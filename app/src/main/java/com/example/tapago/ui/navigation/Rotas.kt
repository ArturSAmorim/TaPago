package com.example.tapago.ui.navigation

object Rotas {
    const val HOME= "HomeScreen"
    const val TREINO= "TreinoScreen"

    const val PERFIL= "PerfilScreen"

    const val ITEM_TREINO = "ItemTreinoScreen/{treinoId}"

    fun itemTreino(id: Int) = "ItemTreinoScreen/$id"
}