package com.enspm.alumni.ui.theme

import androidx.compose.ui.graphics.Color

object AlumniColors {
    // Primary Colors
    val Primary = Color(0xFF2563EB)        // Blue
    val PrimaryDark = Color(0xFF1D4ED8)    // Dark Blue
    val Indigo = Color(0xFF4F46E5)         // Indigo
    val PrimaryContainer = Color(0xFFDEE9FF)

    // Secondary Colors
    val Secondary = Color(0xFF7C3AED)      // Purple
    val SecondaryDark = Color(0xFF6D28D9)

    // Tertiary Colors
    val Tertiary = Color(0xFF0891B2)       // Cyan
    val TertiaryDark = Color(0xFF0E7490)

    // Light Theme - Background & Surfaces
    val Background = Color.White           // #FFFFFF
    val Surface = Color.White              // #FFFFFF
    val SurfaceVariant = Color(0xFFF1F5F9) // Very light gray

    // Light Theme - Text Colors
    val TextPrimary = Color(0xFF0F172A)    // Very dark blue (almost black)
    val TextSecondary = Color(0xFF64748B)  // Medium gray
    val TextMuted = Color(0xFF94A3B8)      // Light gray
    val TextHint = Color(0xFFCBD5E1)       // Very light gray

    // Light Theme - Borders
    val Border = Color(0xFFE2E8F0)         // Light gray border
    val BorderLight = Color(0xFFF1F5F9)    // Very light border
    val Divider = Color(0xFFE2E8F0)

    // Status Colors
    val Success = Color(0xFF10B981)        // Green
    val SuccessLight = Color(0xFFD1FAE5)
    val SuccessDark = Color(0xFF059669)

    val Warning = Color(0xFFF59E0B)        // Amber/Orange
    val WarningLight = Color(0xFFFEF3C7)
    val WarningDark = Color(0xFFD97706)

    val Error = Color(0xFFEF4444)          // Red
    val ErrorLight = Color(0xFFFEE2E2)
    val ErrorDark = Color(0xFFDC2626)

    val Info = Color(0xFF3B82F6)           // Blue
    val InfoLight = Color(0xFFDEE9FF)
    val InfoDark = Color(0xFF1D4ED8)

    val Like = Color(0xFFEF4444)           // Red for likes

    // Dark Theme Colors (Extended for dark mode)
    val DarkBackground = Color(0xFF0F172A)
    val DarkSurface = Color(0xFF1E293B)
    val DarkSurfaceVariant = Color(0xFF334155)
    val DarkTextPrimary = Color(0xFFF1F5F9)
    val DarkTextSecondary = Color(0xFFCBD5E1)
    val DarkBorder = Color(0xFF334155)

    // Gradients
    val PrimaryGradient = listOf(Primary, Indigo)
    val SecondaryGradient = listOf(Secondary, Primary)
}
