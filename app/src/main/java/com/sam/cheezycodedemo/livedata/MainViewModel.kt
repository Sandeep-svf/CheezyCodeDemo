package com.sam.cheezycodedemo.livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val factLiveDataObject = MutableLiveData<String>("This is a facts")

    val factLiveData : LiveData<String>
    get() = factLiveDataObject

    fun updateLiveData(){
        factLiveDataObject.value = ("Another facts")
    }
}