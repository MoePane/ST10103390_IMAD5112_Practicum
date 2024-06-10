package com.example.myweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mainp = findViewById<Button>(R.id.btnMain1)
        var leaveap = findViewById<Button>(R.id.btnExt)

        //button to access mainscreen
        mainp.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }
        leaveap.setOnClickListener {
            MainActivity.finish()
            System.exit(0)
        }





    }

    companion object {
        fun finish() {
            TODO("Not yet implemented")
        }
    }
}