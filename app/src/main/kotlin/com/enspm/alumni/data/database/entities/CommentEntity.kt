package com.enspm.alumni.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date

@Entity(tableName = "comments")
data class CommentEntity(
    @PrimaryKey val id: Long,
    val postId: Long,
    val authorId: Long,
    val authorName: String,
    val body: String,
    val createdAt: Date
)