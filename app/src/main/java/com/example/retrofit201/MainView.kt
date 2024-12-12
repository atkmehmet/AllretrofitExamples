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
    var responseService by mutableStateOf(LoginResponse())

    var productList by mutableStateOf<List<ProductX>>(emptyList())
        private set
    var  error by mutableStateOf("")
    init {

        fetchUser()
        fetchDummyToken(LoginRequest(username = "emilys", password = "emilyspass"))
        fetchProdcut(10,10,"title,price")
    }

    fun fetchUser(){
        try {

            viewModelScope.launch {

                val response = service.getUsers()
                userList = response.users
            }
        }  catch (e:Exception){
            error = e.message?:""
        }

    }

    fun fetchProdcut(limit:Int,skip:Int,select:String){
        try {
              viewModelScope.launch {
                  productList = service.getProduct(limit,skip,select).products

              }
                    }
        catch (e:Exception){
            error = e.message.toString()
        }
    }

    fun fetchDummyToken(request: LoginRequest) {
        viewModelScope.launch {
            try {
                val dummyResponse = service.getToken(request)
                responseService = dummyResponse
            } catch (e: Exception) {
                // Handle the error appropriately
                error = e.message?:"" // Optional: Handle failed state
            }
        }
    }
    fun updateTitle(id:Int,title:String){
        try {
            viewModelScope.launch {

               val xx = service.changeTitle(id,"Galasy ++")
            }
        }
        catch (e:Exception){
            
        }
    }
}
class MainViewModelfactory:ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T = MainView(MyApplication.service) as T
}