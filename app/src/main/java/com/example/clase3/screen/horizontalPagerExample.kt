package com.example.clase3.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun horizontal_prueba(){
    val pagerState = rememberPagerState(initialPage = 0){
        3
    }
    Box(modifier = Modifier.fillMaxSize()){
        HorizontalPager(state = pagerState, modifier = Modifier.fillMaxSize()){
            page -> when(page){
                0 -> cajaMain1()
                1 -> cajaMain2()
                2 -> cajaMain3()
            }
        }
    }
}

@Composable
fun cajaMain1(){
        Box(modifier = Modifier.fillMaxSize()){
            Text(
                text = "Juan",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 50.sp
            )
        }
}

@Composable
fun cajaMain2(){
    Box(modifier = Modifier){
        Text(
            text = "Alejo",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 50.sp
        )
    }
}

@Composable
fun cajaMain3(){
    Box(modifier = Modifier){
        Text(
            text = "Joan",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 50.sp
        )
    }
}



@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
fun Preview(){
    horizontal_prueba()
}