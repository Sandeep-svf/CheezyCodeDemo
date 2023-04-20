package com.sam.cheezycodedemo.androidbootcamp2023.viewModelsexmp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.sam.androidbootcamp2023office.viewmodel.CountryViewModel
import com.sam.cheezycodedemo.R
import com.sam.cheezycodedemo.databinding.ActivityCountBinding

class CountActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCountBinding
    private lateinit var viewModel: CountryViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_count)
        viewModel = ViewModelProvider(this).get(CountryViewModel::class.java)



    }
}