package com.stormsoft.yemenphoneoffline2.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.stormsoft.yemenphoneoffline2.room.entity.EchangeData
import com.stormsoft.yemenphoneoffline2.room.dao.ContactDao

@Database(entities = [EchangeData::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun contactDao(): ContactDao
}
