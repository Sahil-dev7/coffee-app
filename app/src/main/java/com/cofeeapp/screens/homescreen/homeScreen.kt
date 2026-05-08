package com.cofeeapp.screens.homescreen

import com.cofeeapp.R
import android.R.attr.top
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Icon
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.magnifier
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BrushPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cofeeapp.screens.ui_components.MyBottomNav

@Preview()
@Composable
fun HomeScreen() {

    val location = "Bairathi Colony, Indore"
    Scaffold(bottomBar = {MyBottomNav()}) {innerPadding ->

        Box(Modifier.fillMaxWidth().fillMaxHeight(1f/3f).background(brush = Brush.linearGradient(colors = listOf(Color(0xFF303030), // dark roast
            Color(0xFF1F1F1F), // coffee brown
            Color(0xFF121212)  ))))
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(top = 40.dp, start = 16.dp, end = 16.dp)
        ) {
            Text(text = "Location", color = Color.LightGray, fontSize = 14.sp)
            Spacer(Modifier.padding(4.dp))

            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(text = location, color = Color.White, fontSize = 24.sp, fontWeight = Bold)
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = "Change Location",
                    tint = Color.White
                )
            }

            Spacer(Modifier.padding(10.dp))
            SearchBar()
            Spacer(Modifier.padding(10.dp))
            Image(painter = painterResource(R.drawable.banner_1), contentDescription = "Banner")
            Spacer(Modifier.padding(6.dp))
            HomeScreenCategories()

        }
    }
}