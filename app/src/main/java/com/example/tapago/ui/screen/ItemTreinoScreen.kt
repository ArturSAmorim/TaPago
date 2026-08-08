package com.example.tapago.ui.screen

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.RadioButtonChecked
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.tapago.data.model.Exercicio
import com.example.tapago.data.model.ExercicoViewModel
import com.example.tapago.data.model.ListTreinotest.ListaDeTreino1

@Composable
fun ItemTreinoScreen(
    treinoId:Int,
    onBackClick:()-> Unit,
    viewModel: ExercicoViewModel = viewModel(),
) {

    val treino = ListaDeTreino1.find { it.id == treinoId }
    val exercicios by viewModel.exercicios.collectAsState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,

            ) {
            IconButton(onClick = onBackClick) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    contentDescription = "Voltar"
                )
            }


            Text(
                text = treino?.nome ?: "Treino não encontrado",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = MaterialTheme.colorScheme.onBackground

            )

        }


        Text(
            text = treino?.foco ?: "Foco não encontrado",
            fontSize = 16.sp,
            color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.6f),
            modifier = Modifier.padding(start = 48.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(treino?.exercicios ?: emptyList()) { exercicio ->
                CardTExercicio(exercicio = exercicio,
                    onIniciarClick = {viewModel.adicionarExercicio(exercicio)}
                )


            }
        }
    }
}



@Composable
fun CardTExercicio(
    exercicio: Exercicio,
    onIniciarClick: () -> Unit = {},
    onConcluirClick: () -> Unit = {},
    modifier: Modifier= Modifier
) {
    Card(
        modifier = Modifier
            .fillMaxWidth(),
        colors = CardDefaults.cardColors(
            containerColor = if (exercicio.concluido) {
                Color(0xFFE8F5E9)
            } else {
                MaterialTheme.colorScheme.surface
            }
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
            ) {
                Text(
                    text = exercicio.nome,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurfaceVariant

                )
                Spacer(modifier = Modifier.height(8.dp))
                Row(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        text = "${exercicio.series} séries",
                        fontSize = 16.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant

                    )
                    Spacer(modifier=Modifier.width(4.dp))
                    Text(
                        text = "${exercicio.repeticoes} repetições",
                        fontSize = 14.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                }
                Spacer(modifier = Modifier.height(2.dp))
                Text(
                    text = "Carga:${exercicio.carga} kg",
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant

                )
                Text(
                        text = "Tempo de Execução: ${exercicio.tempoExecucao} seg",
                        fontSize = 14.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Text(
                        text = "Descanso:${exercicio.tempoDescanso} seg",
                        fontSize = 14.sp,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    IconButton(onClick = onIniciarClick) {
                        Icon(
                            imageVector = Icons.Default.PlayArrow,
                            contentDescription = "Iniciar Exercicio",
                            tint = MaterialTheme.colorScheme.primary,
                            modifier = Modifier
                                .size(28.dp)
                                .clickable { onIniciarClick() }

                        )
                    }
                    IconButton(onClick = onConcluirClick) {
                        Icon(
                            imageVector = if (exercicio.concluido) Icons.Default.CheckCircle else Icons.Default.RadioButtonChecked,
                            contentDescription = "Concluir Exercício",
                            tint = if (exercicio.concluido) Color(0xFF2E7D32) else MaterialTheme.colorScheme.outline,
                            modifier = Modifier
                                .size(28.dp)

                        )
                    }


                }
            }
        }
    }
}




