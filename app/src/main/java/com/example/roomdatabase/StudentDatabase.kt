package com.example.roomdatabase

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Student::class], version = 1)

abstract class StudentDatabase:RoomDatabase() {

    abstract fun StudentDAO():StudentDAO




}