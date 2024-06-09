package ru.mdator.newsapi.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import java.util.Date

/**
 * {
 * "source": {
 * "id": "the-next-web",
 * "name": "The Next Web"
 * },
 * "author": "Siôn Geschwindt",
 * "title": "World Ocean Day: Meet 3 tech startups protecting our seas",
 * "description": "The ocean covers over 70% of our planet. It regulates the global climate, is home to 80% of life on Earth, acts as a carbon sink, and supports the livelihoods of billions of people. As an avid swimmer and surfer I also think the ocean is simply bloody magnifi…",
 * "url": "https://thenextweb.com/news/world-ocean-day-tech-startups-protecting-our-seas",
 * "urlToImage": "https://img-cdn.tnwcdn.com/image/tnw-blurple?filter_last=1&fit=1280%2C640&url=https%3A%2F%2Fcdn0.tnwcdn.com%2Fwp-content%2Fblogs.dir%2F1%2Ffiles%2F2024%2F06%2Fworld-ocean-day-startups-tech-2.jpg&signature=4fe5dc2d562685ac13cdc1c314403055",
 * "publishedAt": "2024-06-08T06:00:08Z",
 * "content": "The ocean covers over 70% of our planet. It regulates the global climate, is home to 80% of life on Earth, acts as a carbon sink, and supports the livelihoods of billions of people. As an avid swimme… [+5395 chars]"
 * }
 */
@Serializable
data class Article(
    @SerialName("source") val source: Source? = null,
    @SerialName("author") val author: String? = null,
    @SerialName("title") val title: String? = null,
    @SerialName("description") val description: String? = null,
    @SerialName("url") val url: String? = null,
    @SerialName("urlToImage") val urlToImage: String? = null,
    @SerialName("publishedAt") val publishedAt: Date? = null,
    @SerialName("content") val content: String? = null
)