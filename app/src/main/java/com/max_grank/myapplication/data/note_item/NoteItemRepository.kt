package com.max_grank.myapplication.data.note_item

import kotlinx.coroutines.flow.Flow

interface NoteItemRepository {

    suspend fun insertItem(noteItem: NoteItem)

    suspend fun deleteItem(noteItem: NoteItem)

    fun getAllItems(): Flow<List<NoteItem>>

    suspend fun getItemById(id: Int): NoteItem
}