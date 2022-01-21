package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.calculator.databinding.ActivityMainBinding
import java.lang.NullPointerException

class MainActivity : AppCompatActivity() {

    var add: String = ""
    var textDisplay: TextView? = null
    private var _binding: ActivityMainBinding? = null
    private val binding
        get() = _binding?: throw NullPointerException("Binding is not initialized")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        fun conclusionClickListener(view: View){
            add += (view as Button).text.toString()
            binding.textView.text = add
        }

        binding.button0.setOnClickListener {
            conclusionClickListener(it)
        }

        binding.button1.setOnClickListener {
            conclusionClickListener(it)
        }

        binding.button2.setOnClickListener {
            conclusionClickListener(it)
        }

        binding.button3.setOnClickListener {
            conclusionClickListener(it)
        }

        binding.button4.setOnClickListener {
            conclusionClickListener(it)
        }

        binding.button5.setOnClickListener {
            conclusionClickListener(it)
        }

        binding.button6.setOnClickListener {
            conclusionClickListener(it)
        }

        binding.button7.setOnClickListener {
            conclusionClickListener(it)
        }

        binding.button8.setOnClickListener {
            conclusionClickListener(it)
        }

        binding.button9.setOnClickListener {
            conclusionClickListener(it)
        }

        binding.buttonPlus.setOnClickListener {
            conclusionClickListener(it)
        }

        binding.buttonMinus.setOnClickListener {
            conclusionClickListener(it)
        }

        binding.buttonMultiply.setOnClickListener {
            conclusionClickListener(it)
        }

        binding.buttonEqually.setOnClickListener {
            if (add.contains('+')){
                makePlus()
            } else if (add.contains('-')){
                makeMinus()
            } else if (add.contains('*')){
                makeMult()
            }
        }

    }

    fun makePlus(){
        val makeIndex = add.indexOf('+')
        val firstChar = add.substring(0, makeIndex).toInt()
        val secondChar = add.substring(makeIndex +1).toInt()
        val result = firstChar + secondChar
        add = ""
        binding.textView.text = result.toString()
    }

    fun makeMinus(){
        val makeIndex = add.indexOf('-')
        val firstChar = add.substring(0, makeIndex).toInt()
        val secondChar = add.substring(makeIndex +1).toInt()
        val result = firstChar - secondChar
        add = ""
        binding.textView.text = result.toString()
    }

    fun makeMult(){
        val makeIndex = add.indexOf('*')
        val firstChar = add.substring(0, makeIndex).toInt()
        val secondChar = add.substring(makeIndex +1).toInt()
        val result = firstChar * secondChar
        add = ""
        binding.textView.text = result.toString()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}