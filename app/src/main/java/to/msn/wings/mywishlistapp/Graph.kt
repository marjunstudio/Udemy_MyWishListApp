package to.msn.wings.mywishlistapp

import android.content.Context
import androidx.room.Room
import to.msn.wings.mywishlistapp.data.WishDatabase
import to.msn.wings.mywishlistapp.data.WishRepository

object Graph {
    lateinit var database: WishDatabase

    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())
    }

    fun provide(context: Context) {
        database = Room.databaseBuilder(context, WishDatabase::class.java, "wishlist.db").build()
    }
}