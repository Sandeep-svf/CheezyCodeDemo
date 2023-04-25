package com.sam.cheezycodedemo.androidbootcamp2023.andoidbootcamp.viewmodelclass

import androidx.lifecycle.ViewModel

class CountryViewModel : ViewModel() {
    private var count = 0

    fun getCurrentCount() : Int {
        return count
    }

    fun getUpdatedCount() : Int{
        return count++
    }
}

