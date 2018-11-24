package com.sumirah.siwinbonebolango.api

import com.sumirah.siwinbonebolango.model.*
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface SPBEDBApi {

    @GET("/wina/profile.php")
    fun getProfil(): Call<MutableList<Profil>>

    @GET("wina/profile.php")
    fun getProfilDetailId(@Query("id") id: String?): Call<ProfilDetailResponses>

    //Responsenya harus bentuk MutableList, karna bentuk response json yg didapet langsung array yang tdk memiliki nama variable di depan
    @GET("/wina/spbe.php")
    fun getSpbe(): Call<MutableList<Spbe>>

    @GET("wina/spbe.php")
    fun getSpbeDetailId(@Query("id") id: String?): Call<SpbeDetailResponses>



//    fun getSpbeDetail(aplikasiId: String?): String {
//        return Uri.parse(BuildConfig.BASE_URL).buildUpon()
//            .appendPath("wina")
//            .appendPath("spbe.php")
//            .appendQueryParameter("id", aplikasiId)
//            .build()
//            .toString()
//    }

}