package com.enspm.alumni.data.database.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.enspm.alumni.data.database.entities.CommentEntity

@Dao
interface CommentDao {
    @Query("SELECT * FROM comments WHERE postId = :postId ORDER BY createdAt DESC")
    suspend fun getCommentsByPostId(postId: Long): List<CommentEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(comments: List<CommentEntity>)

    @Query("DELETE FROM comments WHERE postId = :postId")
    suspend fun deleteByPostId(postId: Long)
}