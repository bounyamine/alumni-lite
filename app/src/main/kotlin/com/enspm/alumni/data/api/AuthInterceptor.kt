package com.enspm.alumni.data.api

import com.enspm.alumni.data.datastore.TokenStore
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class AuthInterceptor @Inject constructor(
    private val tokenStore: TokenStore
) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val originalRequest = chain.request()
        val isPublicEndpoint = isPublicRoute(originalRequest.url.encodedPath)
        if (isPublicEndpoint) {
            return chain.proceed(originalRequest)
        }
        val token = tokenStore.getToken()
        val requestWithAuth = if (token != null) {
            originalRequest.newBuilder()
                .header("Authorization", "Bearer $token")
                .header("Accept", "application/json")
                .build()
        } else {
            originalRequest
        }
        return chain.proceed(requestWithAuth)
    }

    private fun isPublicRoute(path: String): Boolean {
        val publicRoutes = listOf("/login", "/forgot-password", "/verify-otp", "/resend-otp", "/reset-password")
        return publicRoutes.any { path.contains(it) }
    }
}