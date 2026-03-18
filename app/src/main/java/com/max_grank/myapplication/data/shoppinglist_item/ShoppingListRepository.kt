package com.max_grank.myapplication.data.shoppinglist_item

import kotlinx.coroutines.flow.Flow

interface ShoppingListRepository {
    suspend fun insertItem(shoppingListItem: ShoppingListItem)

    suspend fun deleteItem(shoppingListItem: ShoppingListItem)


    suspend fun updateItem(shoppingListItem: ShoppingListItem)

    fun getAllItems(): Flow<List<ShoppingListItem>>

    suspend fun getListItemById(id: Int): ShoppingListItem?
}