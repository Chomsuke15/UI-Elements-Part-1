package com.example.etonatalaga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity()
{


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val first = findViewById<EditText>(R.id.etFirst)
        val last = findViewById<EditText>(R.id.etLast)
        val email = findViewById<EditText>(R.id.etEmail)
        val num = findViewById<EditText>(R.id.mobileNum)

        var back = findViewById<Button>(R.id.btnBack)
        back.setOnClickListener()
        {
            val fullname = first.text.toString() + last.text.toString()
            val email = email.text.toString()
            val num = num.text.toString()
            val intent = Intent (this, Next::class.java)
            intent.putExtra("Name", fullname)
            intent.putExtra("Email", email)
            intent.putExtra("Num", num)
            val go = Intent(this, Next::class.java)
            startActivity(intent)
        }

    }

}