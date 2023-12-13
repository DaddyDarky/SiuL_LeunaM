package com.example.siul_leunam

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.siul_leunam.adapter.WaifuNikkeAdapter
import com.example.siul_leunam.databinding.ActivityBarajasBinding


class barajas : AppCompatActivity() {

    private  lateinit var binding: ActivityBarajasBinding
    private var waifuNikkeMutableList:MutableList<WaifuNikke> = WaifuNikkeProvider.waifuNikkeList.toMutableList()
    private lateinit var adapter: WaifuNikkeAdapter
    private val llamaner = LinearLayoutManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBarajasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //setContentView(R.layout.activity_barajas)
        binding.ivAnadir.setOnClickListener{createWaifuNikke()}
        iniciarRecyclerView()
    }



    private fun createWaifuNikke(){

        val waifuNikke = WaifuNikke("?",
            "?",
            "?",
            "https://cdn.donmai.us/sample/b2/71/__dorothy_goddess_of_victory_nikke_drawn_by_mzh__sample-b27174444c13cb96dd502d7297e402f4.jpg")
        waifuNikkeMutableList.add(waifuNikke)
        adapter.notifyItemInserted(waifuNikkeMutableList.size-1)
        llamaner.scrollToPositionWithOffset(waifuNikkeMutableList.size-1,20)


    }
    private fun showCustomDialog(position:Int){
        val builder = AlertDialog.Builder(this)
        builder.setTitle("Que te pasa tonto")
        builder.setMessage("Toma tonto")
        builder.setPositiveButton("Aceptar"){ dialogInterface: DialogInterface, i: Int ->
            waifuNikkeMutableList.removeAt(position)
            adapter.notifyItemRemoved(position)
            dialogInterface.dismiss()
        }
        builder.setNegativeButton("Canelar"){
            dialog,wich ->dialog.dismiss()
        }
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    private fun iniciarRecyclerView(){
        adapter = WaifuNikkeAdapter(nikkeList = waifuNikkeMutableList,
                                    onClickListener = {waifuNikke -> onItemSelected(waifuNikke)},
                                    onClickDelete = {position -> onDeleteItem(position)},
                                    onClickActu = {position ->onActuItem(position)},
                                    onClickNew = {position ->onNewItem(position)}
        )

        val manejador = LinearLayoutManager(this)
        //val decoration = DividerItemDecoration(this,manejador.orientation)
        binding.waifusNikke.layoutManager = llamaner;
        binding.waifusNikke.adapter=adapter

    }

    private fun onNewItem(position: Int) {

    }

    private fun onActuItem(position: Int) {

    }

    private fun onDeleteItem(position: Int){
        showCustomDialog(position)
        /*
        waifuNikkeMutableList.removeAt(position)
        adapter.notifyItemRemoved(position)
        */

    }
    private fun onItemSelected(waifuNikke: WaifuNikke){
        Toast.makeText(this,waifuNikke.nikke,Toast.LENGTH_SHORT).show()
    }

}