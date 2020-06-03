package com.example.roomwordsampleit

import androidx.room.Dao
import androidx.room.Query

@Dao
interface ProductDao {
    @Query("SELECT * FROM product")
    fun getAllProducts(): List<Product>
}