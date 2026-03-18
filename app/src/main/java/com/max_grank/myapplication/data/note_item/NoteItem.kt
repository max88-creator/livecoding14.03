package com.max_grank.myapplication.data.note_item

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_item")
data class NoteItem(
    @PrimaryKey
    val id: Int? = null,
    val title: String,
    val description: String,
    val time: String
)