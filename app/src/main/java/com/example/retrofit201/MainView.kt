package com.example.retrofit201

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainView(private val service: Service):ViewModel() {
     var userList by mutableStateOf<List<User>>(emptyList())
        private set

    var  error by mutableStateOf("")
    init {

        fetchUser()
    }

    fun fetchUser(){
        try {

            viewModelScope.launch {

                val users = service.getUsers()
                userList = users
            }
        }  catch (e:Exception){
            error = e.message?:""
        }

    }
}
class MainViewModelfactory:ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T = MainView(MyApplication.service) as T
}