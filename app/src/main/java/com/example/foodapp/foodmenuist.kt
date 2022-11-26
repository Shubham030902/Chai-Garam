package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.LinearLayout

class foodmenuist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foodmenuist)
        supportActionBar?.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        val burgr=findViewById<LinearLayout>(R.id.burger)
        burgr.setOnClickListener {

            startActivity(android.content.Intent(this@foodmenuist, burger::class.java))
        }
        val past=findViewById<LinearLayout>(R.id.past)
        past.setOnClickListener {

            startActivity(android.content.Intent(this@foodmenuist, pasta::class.java))
        }
        val sand=findViewById<LinearLayout>(R.id.sand)
        sand.setOnClickListener {

            startActivity(android.content.Intent(this@foodmenuist, sandwich::class.java))
        }

        val fri=findViewById<LinearLayout>(R.id.fri)
        fri.setOnClickListener {

            startActivity(android.content.Intent(this@foodmenuist, fries::class.java))
        }
        val piz=findViewById<LinearLayout>(R.id.piz)
        piz.setOnClickListener {

            startActivity(android.content.Intent(this@foodmenuist, pizza::class.java))
        }
    }
}