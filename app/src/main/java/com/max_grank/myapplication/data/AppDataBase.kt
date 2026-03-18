package com.max_grank.myapplication.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.max_grank.myapplication.data.add_item.AddItem
import com.max_grank.myapplication.data.add_item.AddItemDao
import com.max_grank.myapplication.data.note_item.NoteItem
import com.max_grank.myapplication.data.note_item.NoteItemDao
import com.max_grank.myapplication.data.shoppinglist_item.ShoppingListDao
import com.max_grank.myapplication.data.shoppinglist_item.ShoppingListItem

@Database(
    entities = [AddItem::class,
        NoteItem::class,
        ShoppingListItem::class],
    version = 1
)
abstract class AppDataBase : RoomDatabase() {
    abstract fun addItemDao(): AddItemDao
    abstract fun noteItemDao(): NoteItemDao
    abstract fun shoppingListDao(): ShoppingListDao
}