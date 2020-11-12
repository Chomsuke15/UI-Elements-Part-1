package com.example.etonatalaga

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text
import java.util.*

class Next : AppCompatActivity() {
    private val seeker: SeekBar? = null
    private val textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        val textView = findViewById<TextView>(R.id.tvAge)
        val seeker = findViewById<SeekBar>(R.id.sbAge)
        val last = findViewById<Button>(R.id.btnLast)
        seeker?.setOnSeekBarChangeListener(object:SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seek: SeekBar,progress: Int, fromUser: Boolean) {
                textView.setText("" + seeker.getProgress());
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                //
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                //
            }
        })
        val datepick = findViewById<Button>(R.id.btnPickDate)
        val dateText     = findViewById<TextView>(R.id.tvBday2)
        val cal = Calendar.getInstance()
        val year = cal.get(Calendar.YEAR)
        val month = cal.get(Calendar.MONTH)
        val day = cal.get(Calendar.DAY_OF_MONTH)
        datepick.setOnClickListener {

            val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                // Display Selected date in TextView
                dateText.setText("" + dayOfMonth + " /" + month + " /" + year)
            }, year, month, day)
            dpd.show()

        }
        val theName = intent.getStringExtra("Name")
        val Email = intent.getStringExtra("Email")
        val Num = intent.getStringExtra("Num")

        last.setOnClickListener()
        {
            val intent = Intent (this, next2::class.java)
            val bday = dateText.text.toString()
            val age = textView.text.toString()
            intent.putExtra("Name", theName)
            intent.putExtra("Email", Email)
            intent.putExtra("Num", Num)
            intent.putExtra("bday", bday)
            intent.putExtra("age", age)

            startActivity(intent)
        }







    }



}