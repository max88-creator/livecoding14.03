package com.max_grank.myapplication.di

import android.app.Application
import androidx.room.Room
import com.max_grank.myapplication.data.AppDataBase
import com.max_grank.myapplication.data.add_item.AddItemRepository
import com.max_grank.myapplication.data.add_item.AddItemRepositoryImpl
import com.max_grank.myapplication.data.note_item.NoteIItemRepositoryImpl
import com.max_grank.myapplication.data.note_item.NoteItem
import com.max_grank.myapplication.data.note_item.NoteItemRepository
import com.max_grank.myapplication.data.shoppinglist_item.ShoppingListRepository
import com.max_grank.myapplication.data.shoppinglist_item.ShoppingListRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MainModule {

    @Provides
    @Singleton
    fun provideMainDb(app: Application): AppDataBase {
        return Room.databaseBuilder(
            app,
            AppDataBase::class.java,
            "shopping_list"
        ).build()
    }

    @Provides
    @Singleton
    fun provideAddItemRepository(appDataBase: AppDataBase): AddItemRepository {
        return AddItemRepositoryImpl(appDataBase.addItemDao())
    }

    @Provides
    @Singleton
    fun provideNoteItemRepository(appDataBase: AppDataBase): NoteItemRepository {
        return NoteIItemRepositoryImpl(appDataBase.noteItemDao())
    }

    @Provides
    @Singleton
    fun provideShoppingListItemRepository(appDataBase: AppDataBase): ShoppingListRepository {
        return ShoppingListRepositoryImpl(appDataBase.shoppingListDao())
    }
}