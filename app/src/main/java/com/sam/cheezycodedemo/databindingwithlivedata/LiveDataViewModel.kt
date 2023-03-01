package com.sam.cheezycodedemo.databindingwithlivedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel : ViewModel() {

    val quoteLiveData = MutableLiveData<String>("This is new string by sam")

    fun updataeQuotes(){
        quoteLiveData.value = "This is chnage ...."
    }
}