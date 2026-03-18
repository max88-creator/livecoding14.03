package com.max_grank.myapplication.data.add_item

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow

@Dao
interface AddItemDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertItem(addItem: AddItem)

    @Delete
    suspend fun deleteItem(addItem: AddItem)

    @Update
    suspend fun updateItem(addItem: AddItem)

    @Query("SELECT * FROM add_item WHERE listId = :listId")
    fun getItemsByListId(listId: Int): Flow<List<AddItem>>

    @Query("SELECT * FROM add_item WHERE id = :itemId")
    suspend fun getItemById(itemId: Int): AddItem?
}