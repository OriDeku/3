package com.example.exam3activity

import android.os.Bundle
import android.app.Activity
import android.content.Intent
import android.view.Menu
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tiaozhuan)
        val btn = findViewById<View>(R.id.id1) as Button
        val btn2 = findViewById<View>(R.id.id2) as Button
        val btn3 = findViewById<View>(R.id.id3) as Button
        val btn4 = findViewById<View>(R.id.id4) as Button
        btn.setOnClickListener {
            val intent = Intent(this@MainActivity, simpleAdapter1::class.java)
            startActivity(intent)
        }
        btn2.setOnClickListener {
            val intent = Intent(this@MainActivity, AlertDialog1::class.java)
            startActivity(intent)
        }
        btn3.setOnClickListener {
            val intent = Intent(this@MainActivity, Mymenu::class.java)
            startActivity(intent)
        }
        btn4.setOnClickListener {
            val intent = Intent(this@MainActivity, Amction::class.java)
            startActivity(intent)
        }
    }


}
