package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        var add: String = ""
        val textDisplay: TextView = findViewById(R.id.text_view)
        val butt: Button = findViewById(R.id.button_0)
        val butt1: Button = findViewById(R.id.button_1)
        val butt2: Button = findViewById(R.id.button_2)
        val butt3: Button = findViewById(R.id.button_3)
        val butt4: Button = findViewById(R.id.button_4)
        val butt5: Button = findViewById(R.id.button_5)
        val butt6: Button = findViewById(R.id.button_6)
        val butt7: Button = findViewById(R.id.button_7)
        val butt8: Button = findViewById(R.id.button_8)
        val butt9: Button = findViewById(R.id.button_9)
        val buttPlus: Button = findViewById(R.id.button_plus)
        val buttMinus: Button = findViewById(R.id.button_minus)
        val buttMultiply: Button = findViewById(R.id.button_multiply)

        butt.setOnClickListener { view ->

            add += (view as Button).text.toString()
            textDisplay.text = add

        }

        butt1.setOnClickListener { view ->

            add += (view as Button).text.toString()
            textDisplay.text = add

        }

        butt2.setOnClickListener { view ->

            add += (view as Button).text.toString()
            textDisplay.text = add

        }

        butt3.setOnClickListener { view ->

            add += (view as Button).text.toString()
            textDisplay.text = add

        }

        butt4.setOnClickListener { view ->

            add += (view as Button).text.toString()
            textDisplay.text = add

        }

        butt5.setOnClickListener { view ->

            add += (view as Button).text.toString()
            textDisplay.text = add

        }

        butt6.setOnClickListener { view ->

            add += (view as Button).text.toString()
            textDisplay.text = add

        }

        butt7.setOnClickListener { view ->

            add += (view as Button).text.toString()
            textDisplay.text = add

        }

        butt8.setOnClickListener { view ->

            add += (view as Button).text.toString()
            textDisplay.text = add

        }

        butt9.setOnClickListener { view ->

            add += (view as Button).text.toString()
            textDisplay.text = add

        }

        buttPlus.setOnClickListener { view ->

            textDisplay.text = (view as Button).text.toString()

        }

        buttMinus.setOnClickListener { view ->

            textDisplay.text = (view as Button).text.toString()

        }

        buttMultiply.setOnClickListener { view ->

            textDisplay.text = (view as Button).text.toString()

        }

    }
}