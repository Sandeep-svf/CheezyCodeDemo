package com.sam.cheezycodedemo.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.sam.cheezycodedemo.R

class MainActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel

    private val textView: AppCompatTextView
    get() = findViewById(R.id.ssta_item_view)

    private val button : AppCompatButton
    get() = findViewById(R.id.update_button)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.factLiveData.observe(this, Observer {
            // if data will be change... this function will be execute.

            textView.text = it

        })
        // live data send update to only who is in active state

        button.setOnClickListener{
            mainViewModel.updateLiveData()
        }

    }
}