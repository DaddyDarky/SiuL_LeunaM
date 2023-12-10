package com.example.siul_leunam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.siul_leunam.adapter.WaifuNikkeAdapter
import com.example.siul_leunam.databinding.ActivityBarajasBinding


class barajas : AppCompatActivity() {

    private  lateinit var binding: ActivityBarajasBinding
    private var waifuNikkeMutableList:MutableList<WaifuNikke> = WaifuNikkeProvider.waifuNikkeList.toMutableList()
    private lateinit var adapter: WaifuNikkeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBarajasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_barajas)
        iniciarRecyclerView()
    }

    private fun iniciarRecyclerView(){
        adapter = WaifuNikkeAdapter(nikkeList = waifuNikkeMutableList,
                                    onClickListener = {waifuNikke -> onItemSelected(waifuNikke)},
                                    onClickDelete = {position -> onDeleteItem(position)}
        )

        val manejador = LinearLayoutManager(this)
        //val decoration = DividerItemDecoration(this,manejador.orientation)
        binding.waifusNikke.layoutManager = manejador;
        binding.waifusNikke.adapter=adapter

    }

    private fun onDeleteItem(position: Int){
        waifuNikkeMutableList.removeAt(position)
        adapter.notifyItemRemoved(position)
    }
    private fun onItemSelected(waifuNikke: WaifuNikke){
        Toast.makeText(this,waifuNikke.nikke,Toast.LENGTH_SHORT).show()
    }

}