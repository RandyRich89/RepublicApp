package com.richardson.example.republicapp.request.requestServices

import com.richardson.example.republicapp.request.items.ResultItem
import retrofit2.Call
import retrofit2.http.GET

interface DataRequestService {

    @GET("/data/")
    fun getData(): Call<ResultItem>
}