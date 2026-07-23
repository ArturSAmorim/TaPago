package com.example.tapago.data.model

data class Exercicio(
    val id: Int,
    val nome: String,
    val series: Int,
    val repeticoes: Int,
    val carga:Int,
    val tempoExecucao:Int,
    val tempoDescanso:Int,
    var concluido: Boolean= false
)
