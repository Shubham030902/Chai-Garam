package com.example.foodapp
import android.os.Bundle
import android.view.WindowManager
import android.app.Activity
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class loginpage : AppCompatActivity(), View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage2)
        supportActionBar?.hide()
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        val btn4 = findViewById<Button>(R.id.buttonsignin)
        btn4.setOnClickListener {
            Toast.makeText(applicationContext,"Account Created!", Toast.LENGTH_SHORT).show()
        }
        val btn6 = findViewById<TextView>(R.id.signup2)
        btn6.setOnClickListener {
            startActivity(android.content.Intent(this@loginpage,loginpage_Activity::class.java))
        }
        val btnskp2=findViewById<TextView>(R.id.buttonsignin)
        btnskp2.setOnClickListener {

            startActivity(android.content.Intent(this@loginpage, foodmenuist::class.java))
        }
    }
    override fun onClick(v: View?) {

    }
}