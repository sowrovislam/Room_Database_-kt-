package com.example.roomdatabase

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "studunt")
data class Student(
    @PrimaryKey( autoGenerate = true)
    val id :Long,
    val  name :String,
    val age:Int





) {

}