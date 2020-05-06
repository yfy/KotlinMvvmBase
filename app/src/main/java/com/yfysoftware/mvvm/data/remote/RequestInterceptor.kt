package com.yfysoftware.mvvm.data.remote

import okhttp3.Interceptor
import okhttp3.Response

class RequestInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val originalHttpUrl = originalRequest.url()
        val _url = originalHttpUrl.newBuilder()
            .addQueryParameter("default_key",Constants.DEFAULT_API_KEY)
            .build()
        val request = originalRequest.newBuilder().url(_url).build()
        return chain.proceed(request)
    }
}