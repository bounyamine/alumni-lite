package com.enspm.alumni.data.database.daos

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.enspm.alumni.data.database.entities.PostEntity

@Dao
interface PostDao {
    @Query("SELECT * FROM posts ORDER BY createdAt DESC LIMIT :limit OFFSET :offset")
    suspend fun getPosts(limit: Int, offset: Int): List<PostEntity>

    @Query("SELECT * FROM posts WHERE id = :id")
    suspend fun getPostById(id: Long): PostEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(posts: List<PostEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(post: PostEntity)

    @Delete
    suspend fun delete(post: PostEntity)

    @Query("DELETE FROM posts")
    suspend fun deleteAll()
}