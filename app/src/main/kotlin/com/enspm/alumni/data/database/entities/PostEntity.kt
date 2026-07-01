package com.enspm.alumni.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "posts")
data class PostEntity(
    @PrimaryKey val id: Long,
    val content: String,
    val authorId: Long,
    val authorName: String,
    val authorPhoto: String?,
    val likesCount: Int,
    val commentsCount: Int,
    val createdAt: Date,
    val updatedAt: Date,
    val mediaUrls: String?
)