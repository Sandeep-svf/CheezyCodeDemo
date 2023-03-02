package com.sam.cheezycodedemo.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.room.Room
import com.sam.cheezycodedemo.R
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import java.util.*

class RoomDbMainActivity : AppCompatActivity() {

    lateinit var   databse: ContactDatabase


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room_db_main2)

       /* // generally used sigleton class for creating instance of database...
        // Creating instance of database... -> it will return obj of databse
        databse = Room.databaseBuilder(applicationContext,
        ContactDatabase::class.java,
        "contactDb").build()*/


        databse = ContactDatabase.getDatabase(this)

        // creating courotine
        GlobalScope.launch {
            databse.contactDao().insertContact(Contaact(0,"sam","1234567890", Date()))
        }



    }

    fun getData(view: android.view.View) {
        databse.contactDao().getContact().observe(this, Observer {
            // when we add anything in db...
            // this method will called...
            Log.d("test_sam",it.toString())
        })

    }
}