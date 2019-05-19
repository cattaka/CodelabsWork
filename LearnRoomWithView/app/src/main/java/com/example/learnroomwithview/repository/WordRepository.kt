package com.example.learnroomwithview.repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.learnroomwithview.database.WordDao
import com.example.learnroomwithview.entity.Word

class WordRepository(private val wordDao: WordDao) {
    val allWords: LiveData<List<Word>> = wordDao.getAllWords()

    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }

}
