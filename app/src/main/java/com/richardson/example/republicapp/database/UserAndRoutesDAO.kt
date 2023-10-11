package com.richardson.example.republicapp.database

import androidx.room.Dao
import androidx.room.Query
import com.richardson.example.republicapp.request.items.DriverItem
import com.richardson.example.republicapp.request.items.RouteItem

@Dao
interface UserAndRoutesDAO {

    @Query("SELECT * FROM driverItem")
    fun getUsers(): List<DriverItem>

    @Query("SELECT * FROM routeItem")
    fun getRoutes(): List<RouteItem>
}