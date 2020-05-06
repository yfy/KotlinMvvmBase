package com.yfysoftware.mvvm.data.local

import androidx.room.*
import com.yfysoftware.mvvm.model.default

@Dao
interface BaseDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun Insert(_default : default)

    @Update
    fun Update(_default: default)

    @Delete
    fun Delete(_default: default)

    @Query("SELECT * FROM `default`" )
    fun getAll(_default: default)

}