package com.example.lab4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.lab4.model.Todo

class RecyclerAdapter(val context: Context, val todo: ArrayList<Todo>): RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_list, parent, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return todo.size
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.MyViewHolder, position: Int) {
        val todo = todo.get(position)
        holder.title.text = todo.title
        holder.status.text = todo.status
        holder.category.text = todo.category
    }

    class MyViewHolder(view: View):RecyclerView.ViewHolder(view){
        var title:TextView = view.findViewById(R.id.title)
        var status:TextView = view.findViewById(R.id.status)
        var category:TextView = view.findViewById(R.id.category)

        init {
            view.setOnClickListener{
            view.findNavController().navigate(R.id.action_todoListFragment_to_todoDetailFragment)
        }
        }


    }


}