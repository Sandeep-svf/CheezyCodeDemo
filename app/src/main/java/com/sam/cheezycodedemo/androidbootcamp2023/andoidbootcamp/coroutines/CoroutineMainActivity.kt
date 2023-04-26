package com.sam.cheezycodedemo.androidbootcamp2023.andoidbootcamp.coroutines

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.sam.cheezycodedemo.R
import com.sam.cheezycodedemo.databinding.ActivityCoroutineMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class CoroutineMainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCoroutineMainBinding
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_coroutine_main)

        binding.btnCount.setOnClickListener(View.OnClickListener {
            binding.tvCount.text = count++.toString()
        })

        binding.btnDownloadUserData.setOnClickListener(View.OnClickListener {

            // Main thread Main
            CoroutineScope(Dispatchers.Main).launch {
                //doenloadUserData()
                Log.i("MyTag","Hello from $${Thread.currentThread().name}")
            }


            // Background thread IO
            CoroutineScope(Dispatchers.IO).launch {
                //doenloadUserData()
                Log.i("MyTag","Hello from $${Thread.currentThread().name}")
            }

        })

    }

    private fun doenloadUserData() {
        for (i in 1..200000){
            Log.i("MyTag","Downloading user $i in $${Thread.currentThread().name}")
        }
    }
}