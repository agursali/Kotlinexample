package com.example.amolgursali.kotlinexample

import android.graphics.LinearGradient
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.example.amolgursali.kotlinexample.R.id.recyclerview

class RecyclerViewClass : AppCompatActivity() {

    val arrayList = ArrayList<User>()
    lateinit var recyclerview : RecyclerView
//    lateinit var linearlayout : LinearLayoutManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_class)
        recyclerview = findViewById(R.id.recyclerview) as RecyclerView
//        linearlayout=LinearLayoutManager(this)
        recyclerview.layoutManager=LinearLayoutManager(this)
        recyclerview.hasFixedSize()
        recyclerview.itemAnimator

        arrayList.add(User("Amol","Beed"))
        arrayList.add(User("ABC","Dound"))
        arrayList.add(User("Amol","Beed"))

        val adapter=RecyclerviewCustomAdapter(arrayList)

        recyclerview.adapter =adapter
    }

}


