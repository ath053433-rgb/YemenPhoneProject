package com.stormsoft.yemenphoneoffline2.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "nambers_thabeet")
data class EchangeData(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    @ColumnInfo(name = "NameFrom")
    val nameFrom: String?,

    @ColumnInfo(name = "EnglishNameFrom")
    val englishNameFrom: String?,

    @ColumnInfo(name = "user_phone")
    val userPhone: String?,

    @ColumnInfo(name = "city")
    val city: String?,

    @ColumnInfo(name = "NameTo")
    val nameTo: String?,

    @ColumnInfo(name = "EnglishNameTo")
    val englishNameTo: String?,

    @ColumnInfo(name = "Ex_Buy")
    val exBuy: String?,

    @ColumnInfo(name = "Ex_Seal")
    val exSeal: String?,

    @ColumnInfo(name = "user_name")
    val userName: String?
)
