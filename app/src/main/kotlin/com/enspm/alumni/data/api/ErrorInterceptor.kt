package com.enspm.alumni.data.api

import android.util.Log
import com.enspm.alumni.data.datastore.TokenStore
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class ErrorInterceptor @Inject constructor(
    private val tokenStore: TokenStore
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val response = chain.proceed(chain.request())
        when (response.code) {
            401 -> {
                tokenStore.clearToken()
                Log.w("ErrorInterceptor", "Unauthorized: Token cleared")
            }
            403 -> Log.w("ErrorInterceptor", "Permission denied: ${response.message}")
            404 -> Log.d("ErrorInterceptor", "Resource not found: ${response.request.url}")
            422 -> Log.d("ErrorInterceptor", "Validation error")
            500 -> Log.e("ErrorInterceptor", "Server error: ${response.message}")
        }
        return response
    }
}