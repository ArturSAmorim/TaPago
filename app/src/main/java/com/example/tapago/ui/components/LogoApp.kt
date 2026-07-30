package com.example.tapago.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.tapago.R


@Composable
fun LogoApp(size:Int){
    Image(
        painter= painterResource(id=R.drawable.logo),
        contentDescription="TaPago",
        modifier = Modifier.size(size.dp)
    )

}
