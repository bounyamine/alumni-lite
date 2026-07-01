package com.enspm.alumni.data.models.notifications

import com.squareup.moshi.JsonClass
import java.util.Date

@JsonClass(generateAdapter = true)
data class Notification(val id: Long, val type: String, val message: String, val is_read: Boolean, val created_at: Date)

@JsonClass(generateAdapter = true)
data class UnreadCountResponse(val count: Int)