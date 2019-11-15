package com.amirahmadadibi.projects.recylerviewwithselection

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amirahmadadibi.projects.recylerviewwithselection.model.User
import kotlinx.android.synthetic.main.list_item.view.*

/**
 * Created by Amirahmad Adibi.
 * RecylerViewWithSelection | Copyrights 2019-11-15.
 */
class MyAdapter(var context: Context, var userList: List<User>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var view: View = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.text_view_username.text = userList.get(position).username
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}