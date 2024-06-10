package com.example.myweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)


        var mainsc = findViewById<Button>(R.id.btnMain2)
        var leave = findViewById<Button>(R.id.btnExt3)

        mainsc.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }
        leave.setOnClickListener {
            MainActivity.finish()
            System.exit(0)
        }
    }
}