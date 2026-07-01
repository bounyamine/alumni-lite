package com.enspm.alumni.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import okhttp3.RequestBody
import okhttp3.MediaType.Companion.toMediaType
import java.io.File

fun Context.isNetworkAvailable(): Boolean {
    val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val network = connectivityManager.activeNetwork ?: return false
    val capabilities = connectivityManager.getNetworkCapabilities(network) ?: return false
    return capabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
}

fun File.toRequestBody(mediaType: String = "image/jpeg"): RequestBody {
    return RequestBody.create(mediaType.toMediaType(), this)
}

fun File.toMultipartBody(paramName: String): okhttp3.MultipartBody.Part {
    return okhttp3.MultipartBody.Part.createFormData(paramName, this.name, this.toRequestBody("image/jpeg"))
}