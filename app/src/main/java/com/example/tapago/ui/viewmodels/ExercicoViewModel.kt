package com.example.tapago.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.example.tapago.data.model.Exercicio
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class ExercicoViewModel: ViewModel() {

    private val _exercicios = MutableStateFlow<List<Exercicio>>(emptyList())
    val exercicios= _exercicios.asStateFlow()

    fun adicionarExercicio(exercicio: Exercicio){
        _exercicios.value += exercicio
    }
    fun removerExercicio(exercicio: Exercicio) {
        _exercicios.value -= exercicio
    }

    fun alternarConcluido(exercicioId: Int) {
        _exercicios.value = _exercicios.value.map { exercicio ->
            if (exercicio.id == exercicioId) {
                exercicio.copy(concluido = !exercicio.concluido)
            } else {
                exercicio
            }
        }
    }

}