package com.enspm.alumni.data.models.auth

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LoginRequest(val email: String, val password: String)

@JsonClass(generateAdapter = true)
data class LoginResponse(val user: User, val token: String, val token_type: String = "Bearer")

@JsonClass(generateAdapter = true)
data class User(val id: Long, val name: String, val email: String, val phone: String?, val photo: String?, val domain: String?, val graduation_year: Int?, val is_worker: Boolean)

@JsonClass(generateAdapter = true)
data class ForgotPasswordRequest(val email: String)

@JsonClass(generateAdapter = true)
data class VerifyOtpRequest(val email: String, val otp: String)

@JsonClass(generateAdapter = true)
data class ResendOtpRequest(val email: String)

@JsonClass(generateAdapter = true)
data class ResetPasswordRequest(val email: String, val otp: String, val password: String, val password_confirmation: String, val logout: Boolean = true)