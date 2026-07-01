package com.enspm.alumni.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkMode
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

@Composable
fun AlumniLiteTheme(
    darkTheme: Boolean = isSystemInDarkMode(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) {
                androidx.compose.material3.dynamicDarkColorScheme(context)
            } else {
                androidx.compose.material3.dynamicLightColorScheme(context)
            }
        }
        darkTheme -> AlumniDarkColorScheme
        else -> AlumniLightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AlumniTypography,
        shapes = AlumniShapes,
        content = content
    )
}
