package com.knackpark.apijsonplaceholder

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitPost {

    @GET("/posts")
    fun getPosts() : Call<List<Posts>>

}