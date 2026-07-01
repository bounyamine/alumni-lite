package com.enspm.alumni.data.models

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiResponse<T>(
    @Json(name = "type")
    val type: String,
    @Json(name = "status")
    val status: Int,
    @Json(name = "message")
    val message: String,
    @Json(name = "data")
    val data: T? = null,
    @Json(name = "errors")
    val errors: Map<String, List<String>>? = null
) {
    fun isSuccess(): Boolean = type == "success" && status in 200..299
    fun isError(): Boolean = type == "error"
    fun isValidationError(): Boolean = type == "validation_error"
}

@JsonClass(generateAdapter = true)
data class PagedResponse<T>(
    @Json(name = "data")
    val data: List<T>,
    @Json(name = "current_page")
    val currentPage: Int,
    @Json(name = "last_page")
    val lastPage: Int,
    @Json(name = "per_page")
    val perPage: Int,
    @Json(name = "total")
    val total: Int
) {
    fun hasMoreData(): Boolean = currentPage < lastPage
}