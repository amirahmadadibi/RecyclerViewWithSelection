package com.amirahmadadibi.projects.recylerviewwithselection

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amirahmadadibi.projects.recylerviewwithselection.model.User

/**
 * Created by Amirahmad Adibi.
 * RecylerViewWithSelection | Copyrights 2019-11-15.
 */
class MyAdapter(context:Context,userList:List<User>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
    }

    override fun getItemCount(): Int {
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {

        }
    }
}