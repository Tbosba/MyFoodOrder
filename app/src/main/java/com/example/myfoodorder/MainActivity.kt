package com.example.myfoodorder

import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var ch1=findViewById<View>(R.id.checkBox)as CheckBox
        var ch2=findViewById<View>(R.id.checkBox2)as CheckBox
        var rate1=findViewById<View>(R.id.rate1)as TextView
        var rate2=findViewById<View>(R.id.rate2)as TextView
        var quantity1=findViewById<View>(R.id.q1)as EditText
        var quantity2=findViewById<View>(R.id.q2)as EditText
        var bill=findViewById<View>(R.id.bill)as TextView
        var makebill=findViewById<View>(R.id.button)as Button
        makebill.setOnClickListener(View.OnClickListener {
            var total=0
            bill.text="BILL\nMenu\tAmount\n"
            if (ch1.isChecked) {
                total=total+rate1.text.toString().toInt()*quantity1.text.toString().toInt()
                bill.text=bill.text.toString()+ch1.text.toString()+"\t\t\t"+(rate1.text.toString().toInt()*quantity1.text.toString().toInt() ).toString()+"\n"
            }
            if (ch2.isChecked) {
                total=total+rate2.text.toString().toInt()*quantity2.text.toString().toInt()
                bill.text=bill.text.toString()+ch2.text.toString()+"\t\t\t\t"+(rate2.text.toString().toInt()*quantity2.text.toString().toInt() ).toString()+"\n"
            }

            bill.text=bill.text.toString()+"Total Bill=\t\t\t"+total.toString()

        })

    }
}