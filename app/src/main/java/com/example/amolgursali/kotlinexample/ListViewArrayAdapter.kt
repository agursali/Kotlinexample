package com.example.amolgursali.kotlinexample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListViewArrayAdapter : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val listview = findViewById(R.id.listview) as ListView
        val arrayList : ArrayList<String> = arrayListOf()

        arrayList.add("How r U ? ")
        arrayList.add("wr r U ? ")

        val adapter : ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.activity_list_item,android.R.id.text1,arrayList)
        listview. adapter=adapter
    }
}
