package com.example.mvp

interface MainActivityView {
    fun updateLuasPersegiPjg(luas: Float)
    fun updateKelilingPersegiPjg(keliling: Float)
    fun updateLuasPersegi(luas: Float)
    fun updateKelilingPersegi(keiling: Float)
    fun showError(errorMsg: String)
}