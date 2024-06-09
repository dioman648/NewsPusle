package ru.mdator.newsapi.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * "status": "ok",
 * "totalResults": 302,
 * "articles": [...]
 */
@Serializable
data class Response<T>(
    @SerialName("status") val status: String,
    @SerialName("totalResults") val totalResults: Int,
    @SerialName("articles") val articles: List<T>,
)