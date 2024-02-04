package com.mahammadjafarzade.tripwayy.util

import android.content.Context
import android.content.SharedPreferences
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.multibindings.StringKey
import javax.inject.Inject

interface MySharedPreferencesInterface{
    fun saveString(key: String, value : String)
    fun getString(key: String, defaultValue : String) : String
}
class MySharedPreferences @Inject constructor(@ApplicationContext private  val context: Context) : MySharedPreferencesInterface{
    private val sharedPreferences : SharedPreferences = context.getSharedPreferences("my pref", Context.MODE_PRIVATE)
    override fun saveString(key: String, value: String) {
        sharedPreferences.edit().putString(key,value).apply()
    }

    override fun getString(key: String, defaultValue: String): String {
        return sharedPreferences.getString(key,defaultValue) ?: defaultValue
    }
}