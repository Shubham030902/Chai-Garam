package com.example.foodapp

import android.os.Bundle
import android.view.WindowManager
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class loginpage_Activity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)
        supportActionBar?.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        val btn3 = findViewById<Button>(R.id.buttonsub)
        btn3.setOnClickListener {
            Toast.makeText(applicationContext,"REGISTERED",Toast.LENGTH_SHORT).show()
        }
        val btn5 = findViewById<TextView>(R.id.logintwo)
        btn5.setOnClickListener {
            startActivity(android.content.Intent(this@loginpage_Activity,loginpage::class.java))
        }
        val btnskp1=findViewById<TextView>(R.id.buttonsub)
        btnskp1.setOnClickListener {

            startActivity(android.content.Intent(this@loginpage_Activity, foodmenuist::class.java))
        }

    }
        override fun onClick(v: View?) {

        }
}