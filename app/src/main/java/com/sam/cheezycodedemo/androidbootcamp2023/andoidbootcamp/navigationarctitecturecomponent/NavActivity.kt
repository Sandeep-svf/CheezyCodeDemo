package com.sam.cheezycodedemo.androidbootcamp2023.andoidbootcamp.navigationarctitecturecomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.sam.cheezycodedemo.R
import com.sam.cheezycodedemo.databinding.ActivityNavBinding

class NavActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNavBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_nav)







    }
}