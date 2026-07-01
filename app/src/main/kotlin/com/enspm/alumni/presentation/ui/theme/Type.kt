package com.enspm.alumni.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.enspm.alumni.R

// Roboto Font Family
val RobotoFontFamily = FontFamily(
    Font(R.font.roboto_light, FontWeight.Light),
    Font(R.font.roboto_regular, FontWeight.Normal),
    Font(R.font.roboto_medium, FontWeight.Medium),
    Font(R.font.roboto_bold, FontWeight.Bold),
    Font(R.font.roboto_black, FontWeight.Black),
)

val AlumniTypography = Typography(
    // Display Styles
    displayLarge = TextStyle(
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = RobotoFontFamily,
        lineHeight = 32.sp,
        letterSpacing = (-0.5).sp
    ),
    displayMedium = TextStyle(
        fontSize = 24.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = RobotoFontFamily,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    displaySmall = TextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = RobotoFontFamily,
        lineHeight = 24.sp,
        letterSpacing = 0.sp
    ),

    // Headline Styles
    headlineLarge = TextStyle(
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = RobotoFontFamily,
        lineHeight = 24.sp,
        letterSpacing = 0.sp
    ),
    headlineMedium = TextStyle(
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = RobotoFontFamily,
        lineHeight = 22.sp,
        letterSpacing = 0.sp
    ),
    headlineSmall = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = RobotoFontFamily,
        lineHeight = 20.sp,
        letterSpacing = 0.sp
    ),

    // Title Styles
    titleLarge = TextStyle(
        fontSize = 16.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = RobotoFontFamily,
        lineHeight = 20.sp,
        letterSpacing = 0.15.sp
    ),
    titleMedium = TextStyle(
        fontSize = 15.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = RobotoFontFamily,
        lineHeight = 18.sp,
        letterSpacing = 0.15.sp
    ),
    titleSmall = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = RobotoFontFamily,
        lineHeight = 17.sp,
        letterSpacing = 0.1.sp
    ),

    // Body Styles
    bodyLarge = TextStyle(
        fontSize = 15.sp,
        fontWeight = FontWeight.Normal,
        fontFamily = RobotoFontFamily,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),
    bodyMedium = TextStyle(
        fontSize = 14.sp,
        fontWeight = FontWeight.Normal,
        fontFamily = RobotoFontFamily,
        lineHeight = 18.sp,
        letterSpacing = 0.25.sp
    ),
    bodySmall = TextStyle(
        fontSize = 13.sp,
        fontWeight = FontWeight.Normal,
        fontFamily = RobotoFontFamily,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp
    ),

    // Label Styles
    labelLarge = TextStyle(
        fontSize = 12.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = RobotoFontFamily,
        lineHeight = 14.sp,
        letterSpacing = 1.5.sp
    ),
    labelMedium = TextStyle(
        fontSize = 11.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = RobotoFontFamily,
        lineHeight = 13.sp,
        letterSpacing = 1.5.sp
    ),
    labelSmall = TextStyle(
        fontSize = 10.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = RobotoFontFamily,
        lineHeight = 12.sp,
        letterSpacing = 1.5.sp
    ),
)
