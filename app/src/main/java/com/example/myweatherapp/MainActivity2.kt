package com.example.myweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        var 
        var leav = findViewById<Button>(R.id.btnExt1)
        var show = findViewById<Button>(R.id.btnDis)

        show.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)

        }
        leav.setOnClickListener {
            MainActivity.finish()
            System.exit(0)
        }

    }
}