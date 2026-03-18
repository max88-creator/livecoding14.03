package com.max_grank.myapplication.data.add_item

import kotlinx.coroutines.flow.Flow

interface AddItemRepository {
    suspend fun insertItem(addItem: AddItem)
    suspend fun deleteItem(addItem: AddItem)
    suspend fun updateItem(addItem: AddItem)
    fun getItemsByListId(id: Int): Flow<List<AddItem>>
    suspend fun getItemById(id: Int): AddItem?
}