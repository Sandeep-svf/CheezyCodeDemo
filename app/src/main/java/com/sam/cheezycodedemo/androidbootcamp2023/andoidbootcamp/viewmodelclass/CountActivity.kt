package com.sam.cheezycodedemo.androidbootcamp2023.andoidbootcamp.viewmodelclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.sam.cheezycodedemo.R
import com.sam.cheezycodedemo.databinding.ActivityCountBinding

class CountActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCountBinding
    private lateinit var viewModel: CountryViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_count)
        viewModel = ViewModelProvider(this).get(CountryViewModel::class.java)

        binding.countText.text = viewModel.getCurrentCount().toString()
        binding.countButton.setOnClickListener(View.OnClickListener {
            binding.countText.text = viewModel.getUpdatedCount().toString()
        })



    }
}