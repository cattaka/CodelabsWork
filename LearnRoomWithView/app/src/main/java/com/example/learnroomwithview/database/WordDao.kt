package com.example.learnroomwithview.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.learnroomwithview.entity.Word

@Dao
interface WordDao {

//    @Query("SELECT * from word_table ORDER BY word ASC")
//    fun getAllWords(): List<Word>

    @Query("SELECT * from word_table ORDER BY word ASC")
    fun getAllWords(): LiveData<List<Word>>

    @Insert
    suspend fun insert(word: Word)

    @Query("DELETE FROM word_table")
    fun deleteAll()

}
