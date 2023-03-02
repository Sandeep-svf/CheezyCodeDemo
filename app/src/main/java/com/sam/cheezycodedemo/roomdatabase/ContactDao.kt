package com.sam.cheezycodedemo.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ContactDao {

    @Insert
    suspend fun insertContact(contaact: Contaact)

    @Update
    suspend fun updateContact(contaact: Contaact)

    @Delete
    suspend fun deleteContact(contaact: Contaact)

    @Query("SELECT * FROM contact")
    fun getContact() : LiveData<List<Contaact>>
    // all get operation perform on live data
    // no need to define suspend if define live data -> live data means it will run on background thread


}