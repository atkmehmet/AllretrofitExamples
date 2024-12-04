package com.example.retrofit201

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainView(private val service: Service):ViewModel() {

}
class MainViewModelfactory:ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T = MainView(MyApplication.service) as T
}