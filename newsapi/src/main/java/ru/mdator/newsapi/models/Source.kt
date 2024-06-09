package ru.mdator.newsapi.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * {
 *  * "source": {
 *  * "id": "the-next-web",
 *  * "name": "The Next Web"
 *  * }
 */
@Serializable
data class Source(
    @SerialName("id") val id: String? = null,
    @SerialName("name") val name: String? = null
)
