package com.yfysoftware.mvvm.data.remote

import retrofit2.Call
import retrofit2.http.GET
import com.yfysoftware.mvvm.model.default
import retrofit2.http.Path

interface ApiService {

    @GET("default/{id}")
    fun getDefault(@Path("id") defId:Int ): Call<default>
}