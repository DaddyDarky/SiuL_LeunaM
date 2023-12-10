package com.example.siul_leunam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.siul_leunam.adapter.WaifuNikkeAdapter


class barajas : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //WaifuNikkeProvider.waifuNikkeList
        iniciarRecyclerView()
        setContentView(R.layout.activity_barajas)
    }

    private fun iniciarRecyclerView(){
        val miRecyclerView = findViewById<RecyclerView>(R.id.waifusNikke)
        miRecyclerView.layoutManager= LinearLayoutManager(this)
        miRecyclerView.adapter = WaifuNikkeAdapter(WaifuNikkeProvider.waifuNikkeList)
    }

}