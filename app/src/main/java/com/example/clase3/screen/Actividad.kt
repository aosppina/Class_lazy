package com.example.clase3.screen

import android.provider.ContactsContract.CommonDataKinds.Email
import android.text.style.BackgroundColorSpan
import androidx.compose.animation.VectorConverter
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.InputChip
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clase3.R
import com.example.clase3.ui.theme.Orange


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun horizontal_actividad(){
    val pagerState = rememberPagerState(initialPage = 0) {
        2
    }
    Box(modifier = Modifier.fillMaxSize()){
        HorizontalPager(state = pagerState, modifier = Modifier.fillMaxSize()) {
                page -> when(page){
            0 -> Content1()
            1 -> Content2()
        }
        }
    }
}

@Composable
fun Main() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFFFFFFF))) {
        horizontal_actividad()
    }
}

@Composable
fun Content2() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(20.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = Modifier.height(75.dp)) {

        }
        Filas1(img = R.drawable.avion, Descript = "#####")

        Spacer(modifier = Modifier.height(20.dp))  // Reduced spacer height

        Text(
            text = "Please use the link below to verify your email and start your journey",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp),  // Reduced vertical padding
            textAlign = TextAlign.Center,
            fontSize = 18.sp
        )

        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Orange),
            modifier = Modifier
                .padding(vertical = 10.dp)
                .height(45.dp)  // Increased button height
                .fillMaxWidth(10f)  // Increased button width
        ) {
            Text(text = "VERIFY EMAIL", color = Color.Black, fontSize = 15.sp)  // Increased text size
        }

        Spacer(modifier = Modifier.weight(1f))  // This spacer pushes the following texts to the bottom

        Text(
            text = "Do you have any questions?",
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp),  // Reduced vertical padding
            textAlign = TextAlign.Center,
            fontSize = 18.sp
        )

        Text(
            text = "contact@mail.com",
            color = Orange,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 5.dp),  // Reduced vertical padding
            textAlign = TextAlign.Center,
            fontSize = 16.sp
        )
    }
}

@Composable
fun Content1() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(20.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
        Row(modifier = Modifier.height(10.dp)) {

        }
        Filas2(img = R.drawable.globo, Descript = "#####")

        Column(modifier = Modifier) {
            Text(
                text = "Welcome to LemonPie!",
                color = Color.Black,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 24.sp
            )
            Text(
                text = "Keep your data safe",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontSize = 15.sp,
                color = Color.Gray
            )
        }

        TextfielMain()


        Column(modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {



            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Orange),
                modifier = Modifier
                    .padding(top = 10.dp)
                    .width(280.dp)
                    .height(45.dp)  // Increased button height
                    .fillMaxWidth(10f)  // Increased button width
            ) {
                Text(
                    text = "LOGIN",
                    color = Color.Black,
                    fontSize = 15.sp
                )
            }


            Text(text = "Forgot password?",
                color = Orange)
        }


        Column(modifier = Modifier.padding(top = 90.dp)) {
            Row {
                Text(
                    text = "Do you Have an account?",
                    fontSize = 15.sp,

                    )

                Text(
                    text = "  Register?",
                    fontSize = 15.sp,
                    color = Orange
                )
            }

        }
    }
}

@Composable
fun TextfielMain(){
    var user by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf(" ")
    }

    Box {
        Column(modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
            OutlinedTextField(value = user, onValueChange ={
                user = it
            }, label = {
                Text(text = "User")
            },
                placeholder = {
                    Text(text = "Waka Waka")
                } ,
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.padding(5.dp)
            )
            OutlinedTextField(value = password, onValueChange = {
                password = it
            }, label = {
                Text(text = "Password")
            },
                placeholder = {
                    Text(text = "******")
                },
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.padding(0.dp)
            )
        }
    }
}

@Composable
fun Filas1(
    img: Int,
    Descript: String,
    modifier: Modifier = Modifier.fillMaxWidth(),
    imgModifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = img),
            contentDescription = Descript,
            modifier = imgModifier
                .width(300.dp)
                .height(320.dp)
        )
    }
}


@Composable
fun Filas2(
    img: Int,
    Descript: String,
    modifier: Modifier = Modifier.fillMaxWidth(),
    imgModifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = img),
            contentDescription = Descript,
            modifier = imgModifier
                .width(200.dp)
                .height(200.dp)
        )
    }
}



@Preview(showSystemUi = true , device = Devices.DEFAULT)
@Composable
private fun Result(){
    Main()

}