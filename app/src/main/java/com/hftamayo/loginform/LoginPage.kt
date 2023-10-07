package com.hftamayo.loginform

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LoginPage() {
    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize().background(
            brush = Brush.linearGradient(listOf(Color(0xfFB7BA2)))
        ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Email", modifier = Modifier.padding(start = 25.dp))
        TextField(
            value = email,
            onValueChange = {email = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
            singleLine = true
        )
        Text(text = "Password", modifier = Modifier.padding(start = 25.dp))
        TextField(
            value = password,
            onValueChange = {password = it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp),
        )
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = { /*TODO*/ }) {
            Text(text = "Login")
        }
    }
}