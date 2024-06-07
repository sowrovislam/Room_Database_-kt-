package com.example.roomdatabase

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.room.Database
import androidx.room.Room
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {


    private lateinit var database: StudentDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        database = Room.databaseBuilder(
            applicationContext,
            StudentDatabase::class.java,
            "Student"
        ).build()



   GlobalScope.launch {

       database.StudentDAO().insertStudent(Student(0,"sowrov",20))


       database.StudentDAO().insertStudent(Student(0,"xxxxxsowrov",20))

 database.StudentDAO().insertStudent(Student(0,"sowrov",20))


       database.StudentDAO().insertStudent(Student(0,"xxxxxsowrov",20))

 database.StudentDAO().insertStudent(Student(0,"sowrov",20))


       database.StudentDAO().insertStudent(Student(0,"xxxxxsowrov",20))


   }




      




    }
}