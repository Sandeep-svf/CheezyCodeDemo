package com.sam.cheezycodedemo.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.sam.cheezycodedemo.R

class DataBindingMainActivity : AppCompatActivity() {

    lateinit var binding: ActivityDataBindingMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_main)

        val quoteObj = Quote("This is me","me")
        binding.quote = quoteObj




    }
}