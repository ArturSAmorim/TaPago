package com.example.tapago.data.model

object ListTreinotest {
    val ListaDeTreino1 = listOf(
        Treino(
            id = 1,
            nome = "Treino A",
            foco = "Peito, Ombro, Triceps",
            dificuldade = "Intermediário",
            descricao = "Foco em Execução",
            exercicios = listOf(
                Exercicio(
                    id = 1,
                    nome = "Supino inclinado",
                    series = 4,
                    repeticoes = 12,
                    carga = 25,
                    tempoExecucao = 45,
                    tempoDescanso = 180,
                    concluido = false
                ),
                Exercicio(
                    id = 2,
                    nome = "Supino Reto",
                    series = 4,
                    repeticoes = 12,
                    carga = 40,
                    tempoExecucao = 45,
                    tempoDescanso = 180,
                    concluido = false
                ),
                Exercicio(
                    id = 3,
                    nome = "Elevação Lateral",
                    series = 4,
                    repeticoes = 12,
                    carga = 12,
                    tempoExecucao = 45,
                    tempoDescanso = 120,
                    concluido = false
                ),
                Exercicio(
                    id = 4,
                    nome = "Triceps Polia",
                    series = 4,
                    repeticoes = 12,
                    carga = 50,
                    tempoExecucao = 45,
                    tempoDescanso = 120,
                    concluido = false
                )
            )
        ),
        Treino(
            id = 2,
            nome = "Treino B",
            foco = "Costas, Biceps",
            dificuldade = "Intermediário",
            descricao = "Foco em Execução",
            exercicios = listOf(
                Exercicio(
                    id = 1,
                    nome = "Puxador Frontal pegada aberta",
                    series = 4,
                    repeticoes = 12,
                    carga = 60,
                    tempoExecucao = 45,
                    tempoDescanso = 180,
                    concluido = false
                ),
                Exercicio(
                    id = 2,
                    nome = "Remada baixa",
                    series = 4,
                    repeticoes = 12,
                    carga = 25,
                    tempoExecucao = 45,
                    tempoDescanso = 120,
                    concluido = false
                ),
                Exercicio(
                    id = 3,
                    nome = "Pull down",
                    series = 4,
                    repeticoes = 12,
                    carga = 25,
                    tempoExecucao = 45,
                    tempoDescanso = 120,
                    concluido = false
                ),
                Exercicio(
                    id = 4,
                    nome = "Biceps smith",
                    series = 4,
                    repeticoes = 12,
                    carga = 25,
                    tempoExecucao = 45,
                    tempoDescanso = 120,
                    concluido = false
                ),
                Exercicio(
                    id = 5,
                    nome = "Rosca Biceps",
                    series = 4,
                    repeticoes = 12,
                    carga = 25,
                    tempoExecucao = 45,
                    tempoDescanso = 120,
                    concluido = false
                )
            )
        ),
        Treino(
            id = 3,
            nome = "Treino C",
            foco = "Perna completo",
            dificuldade = "Intermediário",
            descricao = "Foco em Execução",
            exercicios = listOf(
                Exercicio(
                    id = 1,
                    nome = "Agachamento livre",
                    series = 4,
                    repeticoes = 12,
                    carga = 25,
                    tempoExecucao = 45,
                    tempoDescanso = 180,
                    concluido = false
                ),
                Exercicio(
                    id = 2,
                    nome = "Cadeira extensora",
                    series = 4,
                    repeticoes = 12,
                    carga = 25,
                    tempoExecucao = 45,
                    tempoDescanso = 120,
                    concluido = false
                ),
                Exercicio(
                    id = 3,
                    nome = "Bulgaro",
                    series = 4,
                    repeticoes = 12,
                    carga = 25,
                    tempoExecucao = 45,
                    tempoDescanso = 120,
                    concluido = false
                ),
                Exercicio(
                    id = 4,
                    nome = "Cadeira flexora",
                    series = 4,
                    repeticoes = 12,
                    carga = 25,
                    tempoExecucao = 45,
                    tempoDescanso = 120,
                    concluido = false
                ),
                Exercicio(
                    id = 5,
                    nome = "Panturrilha em pé",
                    series = 4,
                    repeticoes = 12,
                    carga = 25,
                    tempoExecucao = 45,
                    tempoDescanso = 120,
                    concluido = false
                )
            )
        )
    )
}