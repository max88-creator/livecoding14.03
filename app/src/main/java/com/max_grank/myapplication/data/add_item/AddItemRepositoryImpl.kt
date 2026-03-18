package com.max_grank.myapplication.data.add_item

import kotlinx.coroutines.flow.Flow

class AddItemRepositoryImpl(
    private val dao: AddItemDao
): AddItemRepository {
    override suspend fun insertItem(addItem: AddItem) {
        dao.insertItem(addItem)
    }

    override suspend fun deleteItem(addItem: AddItem) {
        dao.deleteItem(addItem)
    }

    override suspend fun updateItem(addItem: AddItem) {
        dao.updateItem(addItem)
    }

    override fun getItemsByListId(id: Int): Flow<List<AddItem>> {
        return dao.getItemsByListId(id)
    }

    override suspend fun getItemById(id: Int): AddItem? {
        return dao.getItemById(id)
    }

}