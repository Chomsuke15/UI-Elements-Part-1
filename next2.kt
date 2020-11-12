package com.example.etonatalaga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class next2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.next2)

        var intent: Intent = intent
        val theName = intent.getStringExtra("Name")
        val Email = intent.getStringExtra("Email")
        val Num = intent.getStringExtra("Num")
        val bday = intent.getStringExtra("bday")
        val age = intent.getStringExtra("age")


        val nname = findViewById<TextView>(R.id.aName)
        val eemail = findViewById<TextView>(R.id.aEmail)
        val sage = findViewById<TextView>(R.id.aAge)
        val bbday = findViewById<TextView>(R.id.aBday)
        val nnum = findViewById<TextView>(R.id.aNum)

        nname.setText("" + theName)
        eemail.setText("" + Email)
        sage.setText("" + age)
        bbday.setText("" + bday)
        nnum.setText("" + Num)



    }
}