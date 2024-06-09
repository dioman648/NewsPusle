package ru.mdator.newsapi

import androidx.annotation.IntRange
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.create
import retrofit2.http.GET
import retrofit2.http.Query
import ru.mdator.newsapi.models.Article
import ru.mdator.newsapi.models.Language
import ru.mdator.newsapi.models.Response
import ru.mdator.newsapi.models.SortBy
import java.util.Date


/**
 * Api Docs: https://newsapi.org/docs
 */
interface NewsApi {


    /**
     * Api details: https://newsapi.org/docs/endpoints/everything
     */
    @GET("/everything")
    suspend fun everything(
        @Query("q") query: String? = null,
        @Query("from") from: Date? = null,
        @Query("to") to: Date? = null,
        @Query("language") language: List<Language>? = null,
        @Query("sortBy") sortBy: SortBy? = null,
        @Query("pageSize") @IntRange(1, 100) pageSize: Int? = 100,
        @Query("page") page: Int? = 1,
    ): Result<Response<Article>>
}

internal fun getNewsApi(
    baseUrl: String,
    okHttpClient: OkHttpClient? = null,
): NewsApi {
    return retrofit(baseUrl, okHttpClient).create()
}

private fun retrofit(baseUrl: String, okHttpClient: OkHttpClient?): Retrofit {
    return Retrofit.Builder()
        .baseUrl(baseUrl)
        .apply { if (okHttpClient != null) client(okHttpClient) }
        .build()
}