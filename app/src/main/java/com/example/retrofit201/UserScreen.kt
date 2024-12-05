package com.example.retrofit201

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun userScreen(users:List<User>){
    Column (modifier = Modifier.fillMaxSize()) {

        LazyColumn(modifier = Modifier.padding(16.dp)) {
            items(users.size){
                Column (modifier = Modifier.padding(16.dp)){
                    Text(text = users[it].username)
                    Text(text = users[it].username)
                    Text(text = users[it].email)
                }
            }
        }
    }

}