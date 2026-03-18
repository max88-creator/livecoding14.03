package com.max_grank.myapplication.data.note_item

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(noteItem: NoteItem)

    @Delete
    suspend fun deleteItem(noteItem: NoteItem)

    @Query("SELECT * FROM note_item")
    fun getAllItems(): Flow<List<NoteItem>>

    @Query("SELECT * FROM note_item WHERE id = :id")
    suspend fun getItemById(id: Int): NoteItem
}