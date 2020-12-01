package com.example.lab4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class TodoListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view = inflater.inflate(R.layout.fragment_todo_list, container, false)


        val todolist = view.findViewById<RecyclerView>(R.id.recyclerview)
        todolist.adapter = RecyclerAdapter(view.context, this)
        todolist.layoutManager = LinearLayoutManager(view.context)

        return view
    }

    fun onClick(view:View){
        when(view.id){
            R.id.addtodo -> openFragment()
        }
    }

    fun openFragment(){
        findNavController().navigate(R.id.action_todoListFragment_to_addTodoFragment)
    }

}