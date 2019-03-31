package com.example.mytodo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.recycler_view_todo.view.*

class TodoAdapter(private val mCtx: Context, private val mTodoList: List<Todo>) :
    RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): TodoViewHolder {
        var view = LayoutInflater.from(mCtx).inflate(R.layout.recycler_view_todo,viewGroup,false)
        return TodoViewHolder(view)
    }

    override fun onBindViewHolder(holder: TodoViewHolder, i: Int) {
        val todo = mTodoList[i]
        holder.tv_title.text = todo.title
    }

    override fun getItemCount(): Int {
        return mTodoList.size
    }

    inner class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var  tv_title = itemView.title
    }
}
