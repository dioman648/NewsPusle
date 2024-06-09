package ru.mdator.newsapi

class NewsApiProvider(){

    fun getNewsApi(): NewsApi {
        return getNewsApi("https://newsapi.org/v2")
    }
}