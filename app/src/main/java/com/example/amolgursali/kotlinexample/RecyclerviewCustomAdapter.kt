package com.example.amolgursali.kotlinexample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
/**
 * Created by AmolGursali on 7/24/2017.
 */

class RecyclerviewCustomAdapter (val arrayList : ArrayList<User>) : RecyclerView.Adapter<RecyclerviewCustomAdapter.Holder>()
{
    override fun onBindViewHolder(holder: RecyclerviewCustomAdapter.Holder, position: Int) {

        holder.name.text = arrayList.get(position).name
        holder.address.text = arrayList.get(position).address
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerviewCustomAdapter.Holder
    {
        val v=LayoutInflater.from(parent.context).inflate(R.layout.row2,parent,false)
        return Holder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
    class Holder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
      val name = itemView.findViewById(R.id.name) as TextView
      val address = itemView.findViewById(R.id.address) as  TextView
    }

}