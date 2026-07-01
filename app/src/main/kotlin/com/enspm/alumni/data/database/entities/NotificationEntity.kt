package com.enspm.alumni.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "notifications")
data class NotificationEntity(
    @PrimaryKey val id: Long,
    val type: String,
    val message: String,
    val isRead: Boolean,
    val createdAt: Date
)