package com.richardson.example.republicapp.models

import androidx.lifecycle.MutableLiveData
import com.richardson.example.republicapp.request.items.ResultItem
import com.richardson.example.republicapp.request.requestServices.DataRequestService
import request.DataApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class StartUpModel {
    var resultItem = MutableLiveData<ResultItem?>()
    var progress = MutableLiveData(0)

    fun getData() {
        val dataApiClient = DataApiClient.getRetrofitInstance().create(DataRequestService::class.java)
        val call =  dataApiClient.getData()
        progress.value = 75

        call.enqueue(object: Callback<ResultItem> {
            override fun onResponse(call: Call<ResultItem>, response: Response<ResultItem>) {
                progress.value = 100
                resultItem.value = response.body()
            }
            override fun onFailure(call: Call<ResultItem>, t: Throwable) {
                progress.value = 100
                resultItem.value = null
            }
        })
    }
}