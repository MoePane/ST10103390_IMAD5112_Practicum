package com.example.myweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TableLayout
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    private val days = mutableListOf<String>()
    private val minTemp = mutableListOf<Int>()
    private val maxTemp = mutableListOf<Int>()
    private val weathcond = mutableListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)



        var remove = findViewById<Button>(R.id.btnRev)
        var leav = findViewById<Button>(R.id.btnExt1)
        var show = findViewById<Button>(R.id.btnDis)
        var day = findViewById<EditText>(R.id.etnDay)
        var min = findViewById<EditText>(R.id.etnMin)
        var max = findViewById<EditText>(R.id.etnMax)
        var cond = findViewById<EditText>(R.id.etnWeathcon)
        var stor = findViewById<Button>(R.id.btnStore)

        //This stores the users input//
        stor.setOnClickListener {

            if (days.size < 7) {

                var day = day.text.toString()
                var min = min.text.toString().toIntOrNull() ?: 0
                var max = max.text.toString().toIntOrNull() ?: 0
                var cond = cond.text.toString()

                if (day.isEmpty()){
                    Toast.makeText(this,"Please fill in all fields", Toast.LENGTH_SHORT).show()

                    (min.isEmpty())
                        Toast.makeText(this,"Please fill in all fields", Toast.LENGTH_SHORT).show()

                    (max.isEmpty())
                        Toast.makeText(this,"Please fill in all fields", Toast.LENGTH_SHORT).show()

                    (cond.isEmpty())
                        Toast.makeText(this,"Please fill in all fields", Toast.LENGTH_SHORT).show()

                    days.add(day)
                    minTemp.add(min)
                    maxTemp.add(max)
                    weathcond.add(cond)


                }
            }
        }

    show.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java).apply {

                putStringArrayListExtra("days",ArrayList(days))
                putStringArrayListExtra("weathcond",ArrayList(weathcond))
                putStringArrayListExtra("minTemp", ArrayList(minTemp).toString())
                putStringArrayListExtra("maxTemp", ArrayList(maxTemp).toString())

            }
            startActivity(intent)

        }
        leav.setOnClickListener {
            MainActivity.finish()
            System.exit(0)
        }

        remove.setOnClickListener {

            day.text.clear()
            min.text.clear()
            max.text.clear()
            cond.text.clear()

        }

    }

    private fun putStringArrayListExtra(s: String, toString: String) {

    }


}

private fun Int.isEmpty() {
    TODO("Not yet implemented")
}
