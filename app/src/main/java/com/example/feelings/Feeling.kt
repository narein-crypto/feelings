package com.example.feelings

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.sql.Date

@Entity(tableName="feeling")
data class Feeling ( @PrimaryKey(autoGenerate = true) val id: Int,
                     val mode: Int,
                     val created_at: Date,
                     val remarks: String
){


}