package com.richardson.example.republicapp.request.items

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class RouteItem(
    @PrimaryKey
    val uid: Int,
    @SerializedName("id")
    @ColumnInfo (name = "id")
    val id: Int?,
    @SerializedName("type")
    @ColumnInfo (name = "type")
    var type: String?,
    @SerializedName("name")
    @ColumnInfo (name = "name")
    val name: String?
)