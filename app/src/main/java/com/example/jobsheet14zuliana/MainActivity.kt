package com.example.jobsheet14zuliana

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val red = findViewById<Button>(R.id.red)
        val yellow = findViewById<Button>(R.id.yellow)
        val green = findViewById<Button>(R.id.green)
        val blue = findViewById<Button>(R.id.blue)
        val purple = findViewById<Button>(R.id.purple)

        red.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container , RedFragment())
            fragmentTransaction.commit()
        }
        yellow.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container , yellowFragment())
            fragmentTransaction.commit()
        }
        green.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container , greenFragment())
            fragmentTransaction.commit()
        }
        blue.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container , blueFragment())
            fragmentTransaction.commit()
        }
        purple.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.container , purpleFragment())
            fragmentTransaction.commit()
        }
    }
}