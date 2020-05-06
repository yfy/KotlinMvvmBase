package com.yfysoftware.mvvm.data.local


import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.yfysoftware.mvvm.model.default


@Database(entities = [default::class],version = 1)
abstract class BaseDatabase : RoomDatabase() {
        abstract fun baseDao() : BaseDao
        companion object{
            @Volatile
            var INSTANCE:BaseDatabase? = null

            @Synchronized
            fun getInstance(context: Context) : BaseDatabase {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        BaseDatabase::class.java,
                        "default-db"
                    )
                    .build()
                }
                return INSTANCE as BaseDatabase
            }
        }
}