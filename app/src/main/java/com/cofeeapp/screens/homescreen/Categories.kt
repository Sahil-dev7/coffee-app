package com.cofeeapp.screens.homescreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun HomeScreenCategories() {
    val categories = mutableStateOf("All Coffees","Macchiato","Latte","Americano","Snacks","Deserts")

    LazyRow(
        modifier = Modifier.padding(horizontal = 12.dp,
            horizontalArrangement = Arrangement.spacedBy(8.dp))
    ) {
        items(items = categories){
            CategoryChip(text = it, isSelected = false, onClick = {})

        }
    }
}