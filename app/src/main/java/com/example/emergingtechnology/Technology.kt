package com.example.emergingtechnology

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TechnologyPage(id:Int) {
    val tech = technologies[id-1]
    Column {
        Text(
            text = tech.name,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Image(
            painter = painterResource(tech.picId)
            , contentDescription = null
        )
        Text(tech.description)
        LazyColumn {
            items(tech.languages) { language ->
                Text(language, modifier = Modifier.padding(10.dp))
            }
            }
    }
}