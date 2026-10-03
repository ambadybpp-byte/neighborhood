package org.neighborhood.civic.core.designsystem

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val NeighborhoodColors = lightColorScheme(
    primary = Color(0xFF005B50),
    onPrimary = Color(0xFFFFFFFF),
    secondary = Color(0xFF8C4A00),
    onSecondary = Color(0xFFFFFFFF),
    background = Color(0xFFFCFCF8),
    onBackground = Color(0xFF1B1C1A),
    surface = Color(0xFFFCFCF8),
    onSurface = Color(0xFF1B1C1A),
)

@Composable
fun NeighborhoodTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = NeighborhoodColors,
        content = content,
    )
}
