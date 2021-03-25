package com.example.payme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var dusman:TextView
    lateinit var wife: Button;
    lateinit var kfc:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wife = findViewById(R.id.saista);
        kfc=findViewById(R.id.kfc)
        dusman=findViewById(R.id.areeb)


        wife.setOnClickListener {
             val wife_intent = Intent(this,Umair::class.java);
            startActivity(wife_intent)
        }
        kfc.setOnClickListener{
            Toast.makeText(this ,"i love u siasta ",Toast.LENGTH_SHORT).show()
        }
        dusman.setOnClickListener{
            Toast.makeText(this,"kick your dushman",Toast.LENGTH_SHORT).show()
        }
    }
}