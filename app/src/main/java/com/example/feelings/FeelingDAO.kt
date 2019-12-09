package com.example.feelings

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query


@Dao
interface FeelingDAO {

    @Insert
    suspend fun insertFeeling(feeling: Feeling)

    @Query("SELECT * FROM feeling")
    fun getFeelings() : LiveData<Feeling>
}