package com.example.foodapp
import android.app.Activity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import android.content.Intent
import android.widget.TextView

class MainActivity :Activity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        setContentView(R.layout.activity_main)
//        supportActionBar?.hide()
        val btn=findViewById<Button>(R.id.buttonlogin)
        btn.setOnClickListener{
            startActivity(android.content.Intent(this@MainActivity,loginpage::class.java))
        }
        val btn1=findViewById<Button>(R.id.buttonsignup)
        btn1.setOnClickListener{

            startActivity(android.content.Intent(this@MainActivity,loginpage_Activity::class.java))
        }
        val btnskp=findViewById<TextView>(R.id.skip)
        btnskp.setOnClickListener {

            startActivity(android.content.Intent(this@MainActivity, foodmenuist::class.java))
        }

    }
    override fun onClick(v: View?) {

    }


}