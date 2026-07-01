package com.enspm.alumni

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.enspm.alumni.ui.theme.AlumniLiteTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlumniLiteTheme {
                Surface(
                    modifier = Modifier.background(MaterialTheme.colorScheme.background)
                ) {
                    AlumniApp()
                }
            }
        }
    }
}

@Composable
fun AlumniApp() {
    Surface(
        modifier = Modifier.background(MaterialTheme.colorScheme.background)
    ) {
        // Navigation setup will go here in Phase 2
    }
}