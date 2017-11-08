package com.example.amolgursali.kotlinexample

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView

class ListViewCustomAdapter : AppCompatActivity() {

    val str= arrayOf("One","two","three","four","five","six","seven","eight","nine")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val listview=findViewById(R.id.listviewwithcustomadapter) as ListView

        listview.adapter = CustomAdapter(this,str)
    }
}

class CustomAdapter(context: Context, str: Array<String>) : BaseAdapter()
{

    val inflator : LayoutInflater
    val context : Context
    val str : Array<String>

    init {
        this.inflator = LayoutInflater.from(context)
        this.context=context
        this.str=str
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View
    {
        val view : View
        val vh : Holder
        if(convertView==null)
        {
            view=this.inflator.inflate(R.layout.row,parent,false)
            vh= Holder(view)
            view.tag=vh
        }
        else{
            view=convertView
            vh=view.tag as Holder
        }
        vh.txt.setText(str[position])
        return view
    }

    override fun getItem(position: Int): Any
    {
        return str[position]
    }

    override fun getItemId(position: Int): Long
    {
        return position.toLong()
    }

    override fun getCount(): Int
    {
        return str.size
    }

}

class Holder(view: View)
{
    val txt : TextView
    init {
        txt=view?.findViewById(R.id.txt) as TextView
    }

}
