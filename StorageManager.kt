package com.stormsoft.yemenphoneoffline2.util

import android.content.Context
import android.content.Intent
import android.net.Uri

object StorageManager {
    private const val PREFS_NAME = "app_prefs"
    private const val KEY_URI = "saved_uri"

    fun saveUri(context: Context, uri: Uri) {
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            .edit().putString(KEY_URI, uri.toString()).apply()
        // حفظ صلاحية الوصول للمجلد بشكل دائم
        context.contentResolver.takePersistableUriPermission(uri, 
            Intent.FLAG_GRANT_READ_URI_PERMISSION or Intent.FLAG_GRANT_WRITE_URI_PERMISSION)
    }

    fun getSavedUri(context: Context): Uri? {
        val uriString = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
            .getString(KEY_URI, null)
        return uriString?.let { Uri.parse(it) }
    }
}
