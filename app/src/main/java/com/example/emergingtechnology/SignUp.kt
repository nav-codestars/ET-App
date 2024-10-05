package com.example.emergingtechnology

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SignUp(
    onNavigate: (String) -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Card(
            modifier = Modifier.padding(10.dp)
        )
        {
            Column {
                Text(
                    text = "Welcome Learner",
                    fontFamily = FontFamily.SansSerif,
                    color = Color.Black,
                    fontWeight = FontWeight.Black,
                    fontSize = 30.sp
                )
                 var name by remember {
                     mutableStateOf("")
                 }
                TextField(
                    value = name,
                    onValueChange = {
                        name = it
                    }
                )
                var password by remember {
                    mutableStateOf("")
                }
                TextField(
                    value = password,
                    onValueChange = {
                        password = it
                    }
                )
                Button(
                    modifier = Modifier.padding(5.dp),
                    onClick = {
                        onNavigate("tlist")
                    }
                ) {
                    Text("Login")
                }
            }
        }
    }
}