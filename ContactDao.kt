package com.stormsoft.yemenphoneoffline2.room.dao

import androidx.room.Dao
import androidx.room.Query
import com.stormsoft.yemenphoneoffline2.room.entity.EchangeData
import kotlinx.coroutines.flow.Flow

@Dao
interface ContactDao {
    @Query("""
        SELECT * FROM nambers_thabeet 
        WHERE NameFrom LIKE '%' || :query || '%' 
        OR user_phone LIKE '%' || :query || '%' 
        OR EnglishNameFrom LIKE '%' || :query || '%'
        ORDER BY NameFrom ASC 
        LIMIT 100
    """)
    fun searchContacts(query: String): Flow<List<EchangeData>>

    @Query("SELECT COUNT(*) FROM nambers_thabeet")
    suspend fun getDatabaseSize(): Int
}
