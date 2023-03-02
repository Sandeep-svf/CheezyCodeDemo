package com.sam.cheezycodedemo.roomdatabase

import android.content.Context
import androidx.room.*


@Database(entities = [Contaact::class],version = 1)
@TypeConverters(Convertors::class)
abstract  class ContactDatabase : RoomDatabase() {

    // SQlite only support
    // NULL INTEGER REAL TEXT BLOB

    abstract fun contactDao() : ContactDao

    companion object {
        // @ Volatile -> if value get updates in INSTANCE than all thread will get to know about it.

        @Volatile
        private var INSTANCE : ContactDatabase? = null

        fun getDatabase (context: Context) : ContactDatabase{
            if(INSTANCE == null ){

                // will use synchronized for locking..
                    // it is possible that thwo thread at the same time trying to create instance
                synchronized(this){
                    INSTANCE = Room.databaseBuilder(context.applicationContext,
                        ContactDatabase::class.java,
                        "contactDb").build()
                }


            }
            return INSTANCE!!
        }
    }


}