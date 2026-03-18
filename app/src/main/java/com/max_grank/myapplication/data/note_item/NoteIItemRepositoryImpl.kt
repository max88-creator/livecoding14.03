package com.max_grank.myapplication.data.note_item

import kotlinx.coroutines.flow.Flow

class NoteIItemRepositoryImpl(
    private val dao: NoteItemDao
) : NoteItemRepository {

    override suspend fun insertItem(noteItem: NoteItem) {
        dao.insertItem(noteItem)
    }

    override suspend fun deleteItem(noteItem: NoteItem) {
        dao.deleteItem(noteItem)
    }

    override fun getAllItems(): Flow<List<NoteItem>> {
        return dao.getAllItems()
    }

    override suspend fun getItemById(id: Int): NoteItem {
        return dao.getItemById(id)
    }

}