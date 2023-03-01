package com.sam.cheezycodedemo.databindingwithlivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.sam.cheezycodedemo.R
import com.sam.cheezycodedemo.databinding.ActivityDataBindingLiveDataBinding

class DataBindingLiveDataActivity : AppCompatActivity() {


    lateinit var binding: ActivityDataBindingLiveDataBinding
    lateinit var liveDataViewModel: LiveDataViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_live_data)
        liveDataViewModel = ViewModelProvider(this).get(LiveDataViewModel::class.java)

        binding.liveDataViewModel = liveDataViewModel
        binding.lifecycleOwner = this





    }
}