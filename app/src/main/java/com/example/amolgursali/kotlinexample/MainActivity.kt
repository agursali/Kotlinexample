package com.example.amolgursali.kotlinexample

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

//    val text=findViewById(R.id.txt) as TextView


        val x : Int = 0
        val s  : String=""
        val b="canc"
        val a = 1
        val acss="as"
        var av : String? =""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        av=null
        val button=findViewById(R.id.listviewwitharrayadapter)
        button.setOnClickListener {
                val i= Intent(this@MainActivity,ListViewArrayAdapter::class.java)
                startActivity(i)
//                startActivity(Intent(this@MainActivity,ListViewCustomAdapter::class.java))
        }

        val custom=findViewById(R.id.listviewwithcustom) as Button
        custom.setOnClickListener {
                startActivity(Intent(this@MainActivity,ListViewCustomAdapter ::class.java))
        }
        val recyclerviewbutton = findViewById(R.id.recyclerviewviewwithcustom) as Button
        recyclerviewbutton.setOnClickListener {
                startActivity(Intent(this@MainActivity,RecyclerViewClass::class.java))
        }


    }





}




