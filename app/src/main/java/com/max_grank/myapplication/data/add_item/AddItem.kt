package com.max_grank.myapplication.data.add_item

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "add_item")
data class AddItem(
    @PrimaryKey
    val id: Int? = null,
    val name: String,
    val isChecked: Boolean,
    val listId: Int
)