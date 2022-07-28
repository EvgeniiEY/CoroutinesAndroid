package ru.netology.nmedia.repository

import androidx.lifecycle.LiveData
import retrofit2.Response
import ru.netology.nmedia.dto.Post

interface PostRepository {
    val data: LiveData<List<Post>>
    suspend fun getAll()
//    suspend fun load(): Response<List<Post>>
    suspend fun save(post: Post)
    suspend fun removeById(id: Long)
    suspend fun likeById(id: Long)
    suspend fun unLikeById(id: Long)

}
