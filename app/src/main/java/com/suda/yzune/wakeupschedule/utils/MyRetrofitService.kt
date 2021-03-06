package com.suda.yzune.wakeupschedule.utils

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.HTTP

interface MyRetrofitService {
    @GET("/school/count")
    fun addCount(): Call<ResponseBody>

    @GET("/school/get_donate")
    fun getDonateList(): Call<ResponseBody>

    @GET("/school/getupdate")
    fun getUpdateInfo(): Call<ResponseBody>

    @GET("/school/count_html")
    fun getHtmlCount(): Call<ResponseBody>

    @HTTP(method = "POST", path = "/school/apply_html", hasBody = true)
    @FormUrlEncoded
    fun postHtml(@Field("school") school: String,
                 @Field("type") type: String,
                 @Field("html") html: String,
                 @Field("qq") qq: String
    ): Call<ResponseBody>
}