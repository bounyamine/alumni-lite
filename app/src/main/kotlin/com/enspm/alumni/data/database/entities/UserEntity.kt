package com.enspm.alumni.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class UserEntity(
    @PrimaryKey val id: Long,
    val name: String,
    val email: String,
    val phone: String?,
    val photo: String?,
    val domain: String?,
    val graduationYear: Int?,
    val isWorker: Boolean,
    val bio: String?
)