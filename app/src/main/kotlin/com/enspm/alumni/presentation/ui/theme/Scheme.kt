package com.enspm.alumni.ui.theme

import androidx.compose.material3.ColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme

val AlumniLightColorScheme: ColorScheme = lightColorScheme(
    primary = AlumniColors.Primary,
    onPrimary = AlumniColors.TextPrimary,
    primaryContainer = AlumniColors.PrimaryContainer,
    onPrimaryContainer = AlumniColors.Primary,

    secondary = AlumniColors.Secondary,
    onSecondary = AlumniColors.Surface,
    secondaryContainer = Color(0xFFEDE7F6),
    onSecondaryContainer = AlumniColors.Secondary,

    tertiary = AlumniColors.Tertiary,
    onTertiary = AlumniColors.Surface,
    tertiaryContainer = Color(0xFFCEFAFD),
    onTertiaryContainer = AlumniColors.Tertiary,

    error = AlumniColors.Error,
    onError = AlumniColors.Surface,
    errorContainer = AlumniColors.ErrorLight,
    onErrorContainer = AlumniColors.Error,

    background = AlumniColors.Background,
    onBackground = AlumniColors.TextPrimary,
    surface = AlumniColors.Surface,
    onSurface = AlumniColors.TextPrimary,
    surfaceVariant = AlumniColors.SurfaceVariant,
    onSurfaceVariant = AlumniColors.TextSecondary,

    outline = AlumniColors.Border,
    outlineVariant = AlumniColors.BorderLight,
    scrim = Color(0x00000000),

    inverseSurface = AlumniColors.TextPrimary,
    inverseOnSurface = AlumniColors.Surface,
    inversePrimary = AlumniColors.PrimaryDark,
)

val AlumniDarkColorScheme: ColorScheme = darkColorScheme(
    primary = AlumniColors.Primary,
    onPrimary = AlumniColors.DarkBackground,
    primaryContainer = AlumniColors.PrimaryDark,
    onPrimaryContainer = AlumniColors.PrimaryContainer,

    secondary = AlumniColors.Secondary,
    onSecondary = AlumniColors.DarkBackground,
    secondaryContainer = AlumniColors.SecondaryDark,
    onSecondaryContainer = Color(0xFFEDE7F6),

    tertiary = AlumniColors.Tertiary,
    onTertiary = AlumniColors.DarkBackground,
    tertiaryContainer = AlumniColors.TertiaryDark,
    onTertiaryContainer = Color(0xFFCEFAFD),

    error = AlumniColors.Error,
    onError = AlumniColors.DarkBackground,
    errorContainer = AlumniColors.ErrorDark,
    onErrorContainer = AlumniColors.ErrorLight,

    background = AlumniColors.DarkBackground,
    onBackground = AlumniColors.DarkTextPrimary,
    surface = AlumniColors.DarkSurface,
    onSurface = AlumniColors.DarkTextPrimary,
    surfaceVariant = AlumniColors.DarkSurfaceVariant,
    onSurfaceVariant = AlumniColors.DarkTextSecondary,

    outline = AlumniColors.DarkBorder,
    outlineVariant = AlumniColors.DarkSurfaceVariant,
    scrim = Color(0x00000000),

    inverseSurface = AlumniColors.DarkTextPrimary,
    inverseOnSurface = AlumniColors.DarkBackground,
    inversePrimary = AlumniColors.Primary,
)

// Import missing Color import
import androidx.compose.ui.graphics.Color
