package com.yfysoftware.mvvm.util

import android.content.Context
import android.net.ConnectivityManager

object Connection {
    fun isConnected(context : Context): Boolean {
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        return connectivityManager.activeNetworkInfo?.isConnected ?: false
    }
}