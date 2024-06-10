package com.example.myweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)



        var tble = findViewById<TableLayout>(R.id.tableLay)
        var mainsc = findViewById<Button>(R.id.btnMainsc)
        var leave = findViewById<Button>(R.id.btnExt3)




        var days = intent.getStringArrayListExtra("days")?: arrayListOf()
        var minTemp = intent.getStringArrayListExtra("minTemp")?: arrayListOf()
        var maxTemp= intent.getStringArrayListExtra("maxTemp")?: arrayListOf()
        var weathcond = intent.getStringArrayListExtra("weathcond")?: arrayListOf()

        for (i in days.indices){
            var tableRow = TableRow(this).apply{
                addView(createTextView(days[i]))
                addView(createTextView(minTemp[i]))
                addView(createTextView(maxTemp[i]))
                addView(createTextView(weathcond[i]))
            }
            tble.addView(tableRow)

        }



        mainsc.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }
        leave.setOnClickListener {
            MainActivity.finish()
            System.exit(0)
        }
    }
    private fun createTextView(text: String): TextView {
        return TextView(this).apply{
            setPadding(16,16,16,16)
            this.text = text
        }

    }
}