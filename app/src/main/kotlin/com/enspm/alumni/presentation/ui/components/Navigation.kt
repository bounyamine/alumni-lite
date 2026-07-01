package com.enspm.alumni.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.enspm.alumni.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.People
import androidx.compose.material.icons.filled.Work
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person

/**
 * Bottom Navigation Bar Item
 */
data class BottomNavItem(
    val label: String,
    val icon: ImageVector,
    val route: String,
    val badgeCount: Int = 0
)

/**
 * Alumni Bottom Navigation Bar
 */
@Composable
fun AlumniBottomNavBar(
    navController: NavHostController,
    currentDestination: NavDestination?,
    modifier: Modifier = Modifier
) {
    val items = listOf(
        BottomNavItem(
            label = stringResource(id = R.string.feed),
            icon = Icons.Default.Home,
            route = "feed"
        ),
        BottomNavItem(
            label = stringResource(id = R.string.networking),
            icon = Icons.Default.People,
            route = "networking"
        ),
        BottomNavItem(
            label = stringResource(id = R.string.opportunities),
            icon = Icons.Default.Work,
            route = "opportunities"
        ),
        BottomNavItem(
            label = stringResource(id = R.string.notifications),
            icon = Icons.Default.Notifications,
            route = "notifications",
            badgeCount = 0 // Will be dynamic from ViewModel
        ),
        BottomNavItem(
            label = stringResource(id = R.string.profile),
            icon = Icons.Default.Person,
            route = "profile"
        )
    )

    NavigationBar(
        modifier = modifier
            .fillMaxWidth()
            .height(64.dp),
        containerColor = MaterialTheme.colorScheme.surface,
        contentColor = MaterialTheme.colorScheme.onSurface
    ) {
        items.forEach { item ->
            val isSelected = currentDestination?.route == item.route

            NavigationBarItem(
                icon = {
                    Box(contentAlignment = Alignment.TopEnd) {
                        Icon(
                            imageVector = item.icon,
                            contentDescription = item.label,
                            modifier = Modifier.padding(4.dp)
                        )
                        if (item.badgeCount > 0) {
                            Box(
                                modifier = Modifier
                                    .align(Alignment.TopEnd)
                                    .background(
                                        color = MaterialTheme.colorScheme.error,
                                        shape = androidx.compose.foundation.shape.CircleShape
                                    )
                                    .padding(4.dp)
                            ) {
                                Text(
                                    text = item.badgeCount.toString(),
                                    style = MaterialTheme.typography.labelSmall,
                                    color = MaterialTheme.colorScheme.surface
                                )
                            }
                        }
                    }
                },
                label = {
                    Text(
                        text = item.label,
                        style = MaterialTheme.typography.labelSmall
                    )
                },
                selected = isSelected,
                onClick = {
                    navController.navigate(item.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        lazyRestoreState = true
                        restoreState = true
                    }
                },
                alwaysShowLabel = true
            )
        }
    }
}

/**
 * Top App Bar
 */
@Composable
fun AlumniTopAppBar(
    title: String,
    modifier: Modifier = Modifier,
    navigationIcon: @Composable (() -> Unit)? = null,
    actions: @Composable (() -> Unit)? = null
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(color = MaterialTheme.colorScheme.surface)
            .padding(horizontal = 16.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            if (navigationIcon != null) {
                Box(modifier = Modifier.padding(end = 16.dp)) {
                    navigationIcon()
                }
            }

            Text(
                text = title,
                style = MaterialTheme.typography.titleLarge,
                color = MaterialTheme.colorScheme.onSurface,
                modifier = Modifier.weight(1f)
            )

            if (actions != null) {
                actions()
            }
        }
    }
}
