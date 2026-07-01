package com.enspm.alumni.ui.components

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.valentinilk.shimmer.shimmer

/**
 * Shimmer loading animation
 */
@Composable
fun ShimmerLoadingAnimation(
    modifier: Modifier = Modifier,
    width: Dp = Dp.Unspecified,
    height: Dp = 100.dp,
    shape: RoundedCornerShape = RoundedCornerShape(8.dp)
) {
    Box(
        modifier = modifier
            .let { if (width != Dp.Unspecified) it.fillMaxWidth() else it }
            .height(height)
            .shimmer()
            .background(
                color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
                shape = shape
            )
    )
}

/**
 * Post loading skeleton
 */
@Composable
fun PostSkeletonLoader(modifier: Modifier = Modifier) {
    androidx.compose.foundation.layout.Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        // Author info skeleton
        androidx.compose.foundation.layout.Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 12.dp)
        ) {
            ShimmerLoadingAnimation(
                modifier = Modifier
                    .height(40.dp)
                    .aspectRatio(1f),
                shape = RoundedCornerShape(50)
            )
            androidx.compose.foundation.layout.Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 12.dp)
            ) {
                ShimmerLoadingAnimation(height = 16.dp)
                androidx.compose.foundation.layout.Spacer(modifier = Modifier.height(8.dp))
                ShimmerLoadingAnimation(
                    modifier = Modifier.fillMaxWidth(0.4f),
                    height = 12.dp
                )
            }
        }

        // Content skeleton
        ShimmerLoadingAnimation(height = 80.dp, width = 100.percent)
        androidx.compose.foundation.layout.Spacer(modifier = Modifier.height(12.dp))
        ShimmerLoadingAnimation(
            modifier = Modifier.fillMaxWidth(0.6f),
            height = 12.dp
        )
    }
}

// Add missing imports
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Text

// Helper for percentage width
private val Float.percent: Float
    get() = this / 100f
