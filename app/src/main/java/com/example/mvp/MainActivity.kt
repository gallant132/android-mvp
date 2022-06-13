package com.example.mvp

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible


class MainActivity : AppCompatActivity(),MainActivityView {
    private lateinit var etpjg : EditText
    private lateinit var etlbr : EditText
    private lateinit var btnluas : Button
    private lateinit var btnkel : Button
    private lateinit var btnluaspersegi : Button
    private lateinit var btnkelpersegi : Button
    private lateinit var tvhasil : TextView
    private lateinit var mainActivityPresenter: MainActivityPresenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivityPresenter = MainActivityPresenter(this)
        etpjg = findViewById(R.id.etpjg)
        etlbr = findViewById(R.id.etlbr)
        btnluas = findViewById(R.id.btnluas)
        btnkel = findViewById(R.id.btnkel)
        btnluaspersegi = findViewById(R.id.btnluaspersegi)
        btnkelpersegi = findViewById(R.id.btnkelpersegi)
        tvhasil = findViewById(R.id.tvhasil)






        btnluas.setOnClickListener {
            val panjang = etpjg.text.toString().toFloat()
            val lebar = etlbr.text.toString().toFloat()
            mainActivityPresenter.hitungLuasPersegiPjg(panjang,lebar)
        }

        btnkel.setOnClickListener {
            val panjang = etpjg.text.toString().toFloat()
            val lebar = etlbr.text.toString().toFloat()
            mainActivityPresenter.hitungKelilingPersegiPjg(panjang,lebar)
        }

        btnluaspersegi.setOnClickListener {
            val panjang = etpjg.text.toString().toFloat()
            val lebar = etlbr.text.toString().toFloat()
            mainActivityPresenter.hitungLuasPersegi(panjang,lebar)
        }

        btnkelpersegi.setOnClickListener {
            val panjang = etpjg.text.toString().toFloat()
            val lebar = etlbr.text.toString().toFloat()
            mainActivityPresenter.hitungKelilingPersegi(panjang,lebar)
        }
    }

    override fun updateLuasPersegiPjg(luas: Float) {
        tvhasil.text = luas.toString()+" cm"
    }

    override fun updateKelilingPersegiPjg(keliling: Float) {
        tvhasil.text = keliling.toString()+" cm"
    }

    override fun updateLuasPersegi(luas: Float) {
        tvhasil.text = luas.toString()+" cm"
    }

    override fun updateKelilingPersegi(keiling: Float) {
        tvhasil.text = keiling.toString()+" cm"
    }

    override fun showError(errorMsg: String) {
        tvhasil.text = errorMsg
    }
}
