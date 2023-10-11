package com.richardson.example.republicapp.request.items

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class DriverItem(
    @PrimaryKey
    val uid: Int,
    @SerializedName("id")
    @ColumnInfo (name = "id")
    val id: Int?,
    @SerializedName("name")
    @ColumnInfo (name = "name")
    var name: String?)