package com.example.recyclerviewhw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var recyclerView:RecyclerView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        connectView()
        prepareRecyclerView()
    }
    private fun connectView(){

        recyclerView = findViewById(R.id.recycler)
    }
    private fun prepareRecyclerView(){

        val array:ArrayList<Phone> = ArrayList()
        array.add(Phone("Pixel 5","Google",R.drawable.ppp))
        array.add(Phone("Note20","Google",R.drawable.ppp))
        array.add(Phone("SamsungS21","Google",R.drawable.ppp))
        array.add(Phone("Note 10","Google",R.drawable.ppp))
        array.add(Phone("Iphone x","Google",R.drawable.ppp))
        array.add(Phone("Iphone 11","Google",R.drawable.ppp))
        array.add(Phone("pixel xl","Google",R.drawable.ppp))
        array.add(Phone("Samsung S10","Google",R.drawable.ppp))

        val customAdapter:CustomAdapter = CustomAdapter(array)

        recyclerView?.adapter = customAdapter

       // recyclerView?.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        // هذا السطر يستغنى عنه بالسطر الذي اضفناه في main activity xml
    }
}