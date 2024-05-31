package com.example.clase3.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LazyContent(){
    Box(modifier = Modifier.fillMaxSize()){
        simpleLazyRow()
        simpleLazyColumn()
    }
}

@Composable
fun simpleLazyRow(){
    val items = listOf("item1", "item2", "item3", "item4", "item2", "item3", "item4", "Juan")

    LazyRow(modifier = Modifier.fillMaxWidth()){
        items(items){item -> Text(text = item, modifier = Modifier.padding(16.dp))}
    }
}

@Composable
fun simpleLazyColumn(){
    val items = listOf("item1", "item2", "item3", "item4", "item2", "item3", "item4", "Juan")

    LazyColumn(modifier = Modifier.fillMaxHeight()){
        items(items){item -> Text(text = item, modifier = Modifier.padding(16.dp))}
    }
}

@Preview(showSystemUi = true , device = Devices.DEFAULT)
@Composable
private fun Result(){
    LazyContent()
}

