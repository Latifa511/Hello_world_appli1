package com.example.hello_world_appli1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var subm:Button
    lateinit var x1:TextView
    lateinit var x2:TextView

    fun sum (num1 : Int , num2 : Int) : Int {
        return num1+num2
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        subm = findViewById(R.id.btn1)
        subm.setOnClickListener {

            var x = 100
            var y = 1000
            var add = sum(x,y)

            if (x < y){
                x1 = findViewById(R.id.txt1)
                x1.text = "Hello world"

                x2 = findViewById(R.id.txt2)
                x2.text ="$add"

            }else{
                Log.d("MainActivity" , "Hello World!")
            }
        }


    }}