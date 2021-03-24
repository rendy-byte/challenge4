package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class Activity_Slider : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__slider)

        //splash screen
        Handler(Looper.getMainLooper()).postDelayed(
            {
                startActivity(Intent(this@Activity_Slider, MainActivity::class.java))
                finish()
            }, 3000
        )
    }
}