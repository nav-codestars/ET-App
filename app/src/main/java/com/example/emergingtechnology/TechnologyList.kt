package com.example.emergingtechnology

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun TechnologyList(
    onNavigate: (String) -> Unit
) {
    LazyColumn {
        items(technologies) { technology ->
            TechnologyCard(technology,onNavigate)
        }
    }
}

@Composable
fun TechnologyCard(technology: Technology,onNavigate: (String) -> Unit) {
    Card(
        modifier = Modifier.padding(8.dp).clickable(true, onClick = { onNavigate("tpage/${technology.id}") })
    ) {
        Column(Modifier.padding(10.dp)) {
            Image(painter = painterResource(technology.picId), contentDescription = null)
            Column {
                Text(text = technology.name, fontWeight = FontWeight.Bold)
                Text(text = technology.description)
            }
        }
    }
}