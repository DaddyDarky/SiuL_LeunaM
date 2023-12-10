package com.example.siul_leunam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.siul_leunam.adapter.WaifuNikkeAdapter
import com.example.siul_leunam.databinding.ActivityBarajasBinding
import com.example.siul_leunam.databinding.ActivityMainBinding


class barajas : AppCompatActivity() {

    private  lateinit var binding: ActivityBarajasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBarajasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_barajas)
        iniciarRecyclerView()
    }

    private fun iniciarRecyclerView(){

        //val miRecyclerView = findViewById<RecyclerView>(R.id.waifusNikke)
        binding.waifusNikke.layoutManager= LinearLayoutManager(this)
        binding.waifusNikke.adapter = WaifuNikkeAdapter(WaifuNikkeProvider.waifuNikkeList) { waifuNikke ->
            onItemSelected(
                waifuNikke
            )
        }
    }

    fun onItemSelected(waifuNikke: WaifuNikke){
        Toast.makeText(this,waifuNikke.nikke,Toast.LENGTH_SHORT).show()
    }

}