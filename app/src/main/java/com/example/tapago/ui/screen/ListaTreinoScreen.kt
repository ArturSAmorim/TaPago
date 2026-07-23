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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tapago.data.model.ListTreinotest.ListaDeTreino1
import com.example.tapago.data.model.Treino
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight



@Composable
fun ListaTreinoScreen(onTreinoClick: (Treino) -> Unit) {
    val treinos= ListaDeTreino1


    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item{
            Column(modifier= Modifier.padding(8.dp)) {
                Text(
                    text="Partiu treino",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    color=MaterialTheme.colorScheme.onBackground
                )
                Text(
                    text="Escolha o treino do dia",
                    fontSize = 16.sp,
                    color=MaterialTheme.colorScheme.onBackground.copy(alpha = 0.6f)
                )
            }
        }
        items(
            items = treinos,
            key = { treino -> treino.id }
        ) { treino ->
            CardTreino(
                treino = treino,
                onClick = { onTreinoClick(treino) }
            )
        }
    }


    }



@Composable
fun CardTreino(
    treino: Treino,
    onClick: () -> Unit,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        ),
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = treino.nome,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.onSurfaceVariant
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = treino.foco,
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.8f)
                )
                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "${treino.exercicios.size} Exercícios",
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Medium,
                    color = MaterialTheme.colorScheme.primary
                )
            }
            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = "Ver Exercícios",
                tint = MaterialTheme.colorScheme.primary
            )
        }
    }
}




@Preview(showBackground = true)
@Composable
fun ListaTreinosScreenPreview() {
    MaterialTheme {
        Surface(modifier = Modifier.fillMaxSize()) {
            ListaTreinoScreen(onTreinoClick = {})
        }
    }
}

