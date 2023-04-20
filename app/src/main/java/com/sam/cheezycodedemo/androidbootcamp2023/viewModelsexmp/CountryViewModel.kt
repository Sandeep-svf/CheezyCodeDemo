package com.sam.androidbootcamp2023office.viewmodel

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

