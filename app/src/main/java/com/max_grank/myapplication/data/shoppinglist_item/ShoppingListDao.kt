package com.max_grank.myapplication.data.shoppinglist_item

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface ShoppingListDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(shoppingListItem: ShoppingListItem)

    @Delete
    suspend fun deleteItem(shoppingListItem: ShoppingListItem)

    @Update
    suspend fun updateItem(shoppingListItem: ShoppingListItem)

    @Query("SELECT * FROM shopping_list")
    fun getAllItems(): Flow<List<ShoppingListItem>>

    @Query("SELECT * FROM shopping_list WHERE id = :id")
    suspend fun getListItemById(id: Int): ShoppingListItem?
}