package com.example.retrofit201

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun UserScreenCall(view: MainView = viewModel(factory = MainViewModelfactory() )){

    userScreen(view.userList,view.responseService,view.productList,view.error)

}