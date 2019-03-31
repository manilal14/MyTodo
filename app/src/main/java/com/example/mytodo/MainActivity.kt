package com.example.mytodo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mTodoList: ArrayList<Todo> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpRecyclerView()
    }



    private fun setUpRecyclerView() {

        mTodoList.add(Todo(1,"Have to prepare Lotlin App1",false))
        mTodoList.add(Todo(2,"Have to prepare Lotlin App2",false))
        mTodoList.add(Todo(3,"Have to prepare Lotlin App3",false))
        mTodoList.add(Todo(4,"Have to prepare Lotlin App4",false))
        mTodoList.add(Todo(5,"Have to prepare Lotlin App5",false))

        mTodoList.add(Todo(1,"Have to prepare Lotlin App1",false))
        mTodoList.add(Todo(2,"Have to prepare Lotlin App2",false))
        mTodoList.add(Todo(3,"Have to prepare Lotlin App3",false))
        mTodoList.add(Todo(4,"Have to prepare Lotlin App4",false))
        mTodoList.add(Todo(5,"Have to prepare Lotlin App5",false))

        mTodoList.add(Todo(1,"Have to prepare Lotlin App1",false))
        mTodoList.add(Todo(2,"Have to prepare Lotlin App2",false))
        mTodoList.add(Todo(3,"Have to prepare Lotlin App3",false))
        mTodoList.add(Todo(4,"Have to prepare Lotlin App4",false))
        mTodoList.add(Todo(5,"Have to prepare Lotlin App5",false))

        mTodoList.add(Todo(1,"Have to prepare Lotlin App1",false))
        mTodoList.add(Todo(2,"Have to prepare Lotlin App2",false))
        mTodoList.add(Todo(3,"Have to prepare Lotlin App3",false))
        mTodoList.add(Todo(4,"Have to prepare Lotlin App4",false))
        mTodoList.add(Todo(5,"Have to prepare Lotlin App5",false))

        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter       = TodoAdapter(this, mTodoList)

    }


}
