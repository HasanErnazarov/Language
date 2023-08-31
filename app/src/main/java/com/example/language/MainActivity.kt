package com.example.language

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initviews()
    }

    private fun initviews() {
        val hi = findViewById<TextView>(R.id.tv_salom)
        val kr = findViewById<Button>(R.id.bt_kr)
        val jp = findViewById<Button>(R.id.bt_jp)
        val ar = findViewById<Button>(R.id.bt_ar)
        val fr = findViewById<Button>(R.id.bt_fr)
        val dt = findViewById<Button>(R.id.bt_dt)
        val SecPage = findViewById<TextView>(R.id.tv_2page)

        kr.setOnClickListener{

        }

        fun OpenSecondActivity() {
            val intent =Intent(this, SecondActivity::class.java)
        }

    }
}