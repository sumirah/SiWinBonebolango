package com.sumirah.siwinbonebolango.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiRepository {

//    fun doRequest(url: String): String {
//        return URL(url).readText()
//    }


    val BASE_URL = "http://www.bonebolangokab.go.id"
    val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

}
