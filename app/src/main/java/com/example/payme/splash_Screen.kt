package com.example.payme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splash_Screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash__screen)
        val handler = Handler().postDelayed(
            {
                val splash_intent=Intent(this,MainActivity::class.java)
                startActivity(splash_intent)
            },3000

        )
    }
}