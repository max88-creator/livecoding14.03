package com.max_grank.myapplication.data.shoppinglist_item

import kotlinx.coroutines.flow.Flow

class ShoppingListRepositoryImpl(
    private val dao: ShoppingListDao
): ShoppingListRepository {
    override suspend fun insertItem(shoppingListItem: ShoppingListItem) {
        dao.insertItem(shoppingListItem)
    }

    override suspend fun deleteItem(shoppingListItem: ShoppingListItem) {
        dao.deleteItem(shoppingListItem)
    }

    override suspend fun updateItem(shoppingListItem: ShoppingListItem) {
        dao.updateItem(shoppingListItem)
    }

    override fun getAllItems(): Flow<List<ShoppingListItem>> {
       return dao.getAllItems()
    }

    override suspend fun getListItemById(id: Int): ShoppingListItem? {
        return dao.getListItemById(id)
    }


}