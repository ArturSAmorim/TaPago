package com.example.tapago.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocalFireDepartment
import androidx.compose.material.icons.filled.SevereCold
import androidx.compose.material.icons.filled.Whatshot
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen()
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(2.dp)

    ) {
        Text(
            text = "Bom treio,",
            fontSize = 16.sp,
            modifier = Modifier.padding(start = 20.dp)
        )
        Text(
            text = "Artur Amorim",//Vai ser trocado pelo User
            fontSize = 28.sp,
            modifier = Modifier.padding(start = 20.dp)
        )
        Spacer(modifier = Modifier.padding(14.dp))
        CardSequencia()

    }



}
@Composable
fun CardSequencia(){

    val seq=6// Teste de logica para sequencia
    val colorSequenciaBoa= MaterialTheme.colorScheme.primary
    val colorSequenciaRuim= Color(0xFF00BCD4)

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        colors= CardDefaults.cardColors(
            if(seq>=1) colorSequenciaBoa else colorSequenciaRuim
        )

    ){
        Row(
            modifier = Modifier.fillMaxWidth()
                                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Column(Modifier.padding(16.dp)) {
                Text(
                    text = "Sequência Atual",
                    fontSize = 20.sp

                )
                Spacer(Modifier.padding(4.dp))
                Text(
                    text="6 dias",
                    fontSize = 26.sp
                )
            }
            if(seq>=1) {
                Icon(
                    imageVector = Icons.Filled.Whatshot,
                    contentDescription = "Sequencia Completa",
                    modifier = Modifier.size(80.dp)
                )
            }
            if(seq==0){
                Icon(
                    imageVector = Icons.Filled.SevereCold,
                    contentDescription = "Sequencia Atrasada",
                    modifier = Modifier.size(80.dp)
                )
            }

        }
    }

}


@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}
