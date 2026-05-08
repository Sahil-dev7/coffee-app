package com.cofeeapp.screens.ui_components

import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.material3.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.cofeeapp.R


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MyBottomNav() {
    val navItems = listOf(
        NavItem("Home", R.drawable.regular_outline_home),
        NavItem("Cart", R.drawable.regular_outline_bag),
        NavItem("Favs", R.drawable.regular_outline_heart),
        NavItem("Profile", R.drawable.outline_account_circle_24)
    )
    NavigationBar(contentColor = MaterialTheme.colorScheme.surface,
        modifier = Modifier.height(100.dp)) {
        navItems.forEach { item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(id = item.icon),
                        contentDescription = item.title,)
                },
                label = { Text(text = item.title) },
                modifier = Modifier.height(100.dp),
                selected = true,
                onClick = { },
                alwaysShowLabel = false,
                colors = NavigationBarItemDefaults.colors(

                    selectedIconColor = MaterialTheme.colorScheme.primary,
                    selectedTextColor = MaterialTheme.colorScheme.primary,
                    unselectedIconColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    unselectedTextColor = MaterialTheme.colorScheme.onSurfaceVariant,
                    indicatorColor = MaterialTheme.colorScheme.surface)

            )
        }
    }
}

data class NavItem(
    val title: String,
    val icon : Int
)
