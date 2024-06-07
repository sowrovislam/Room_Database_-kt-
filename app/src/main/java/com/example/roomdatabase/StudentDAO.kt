package com.example.roomdatabase

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query


@Dao
interface StudentDAO {

    @Insert
   suspend fun insertStudent(student: Student)

    @Delete
  suspend  fun deleteStudent(student: Student)



    @Query(value = "SELECT*FROM studunt")
  fun gateOllSutdent():LiveData<List<Student>>




}