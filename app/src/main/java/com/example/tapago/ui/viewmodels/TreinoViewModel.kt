package com.example.tapago.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.tapago.data.model.Exercicio
import com.example.tapago.data.model.ListTreinotest
import com.example.tapago.data.model.Treino
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlin.collections.minus
import kotlin.collections.plus

class TreinoViewModel: ViewModel() {

    private val _treinos = MutableStateFlow<List<Treino>>(emptyList())
    val treinos = _treinos.asStateFlow()
    init{
        _treinos.value = ListTreinotest.ListaDeTreino1
    }

    fun adicionarTreino(treino: Treino){
        _treinos.value += treino
    }
    fun removerExercicio(treino: Treino) {
        _treinos.value -= treino
    }
}