package com.rifsxd.ksunext.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.rifsxd.ksunext.R

/**
 * Full-screen app background image with a theme-aware scrim on top,
 * so text drawn directly on the background stays readable.
 */
@Composable
fun AppBackground(modifier: Modifier = Modifier) {
    val isDark = MaterialTheme.colorScheme.surface.luminance() < 0.5f
    val scrim = if (isDark) Color.Black.copy(alpha = 0.45f) else Color.White.copy(alpha = 0.30f)

    Box(modifier = modifier.fillMaxSize()) {
        Image(
            painter = painterResource(R.drawable.app_background),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(scrim)
        )
    }
}
