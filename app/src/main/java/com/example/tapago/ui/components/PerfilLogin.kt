package com.example.tapago.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.tapago.R
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PerfilLogin(size:Int){
    val shape= CircleShape
    Image(
        painter= painterResource(id = R.drawable.perfil),
        contentDescription="Perfil",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(size.dp)
            .clip(shape)
            .border(
                width =1.dp,
                color= MaterialTheme.colorScheme.secondary,
                shape=shape
            )
        )

}

