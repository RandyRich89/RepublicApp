package com.richardson.example.republicapp.request.items

import com.google.gson.annotations.SerializedName

class ResultItem (
    @SerializedName("drivers")
    val drivers: Array<DriverItem>?,
    @SerializedName("routes")
    val routes: Array<RouteItem>?
)