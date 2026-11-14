package com.example.tapago.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext




private val TaPagoDarkColors = darkColorScheme(
    primary = LimeAccent,
    onPrimary = DeepMossGreen,
    background = CharcoalBlack,
    onBackground = IvoryWhite,
    surface = SlateSurface,
    onSurface = IvoryWhite,
    surfaceVariant = GraphiteVariant,
    onSurfaceVariant = MutedSilver,
    secondaryContainer = GraphiteVariant,
    onSecondaryContainer = LimeAccent
)

@Composable
fun TaPagoTheme(
    darkTheme: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = TaPagoDarkColors

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}