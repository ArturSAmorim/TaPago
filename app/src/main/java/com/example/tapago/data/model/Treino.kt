package com.example.tapago.data.model

import kotlin.times

data class Treino(
    val id:Int,
    val nome: String,//Nome do treino
    val foco: String,//Foco de região
    val dificuldade: String,
    val descricao: String,
    val exercicios: List<Exercicio>

){
    val tempo: Int
        get()= exercicios.sumOf { it.series*(it.tempoExecucao + it.tempoDescanso) }
    val treinoConcluido: Boolean
        get()= exercicios.all {it.concluido}


}
