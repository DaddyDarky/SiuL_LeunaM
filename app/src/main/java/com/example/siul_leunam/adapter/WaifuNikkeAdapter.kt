package com.example.siul_leunam.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.siul_leunam.R
import com.example.siul_leunam.WaifuNikke

class WaifuNikkeAdapter(private val nikkeList:List<WaifuNikke>,
                        private val onClickListener:(WaifuNikke)->Unit,
                        private val onClickDelete:(Int)-> Unit,
                        private val onClickActu:(Int) ->Unit,
                        private val onClickNew:(Int)->Unit


): RecyclerView.Adapter<WaifuNikkeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WaifuNikkeViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return  WaifuNikkeViewHolder(
            layoutInflater.inflate(R.layout.item_waifunikke,parent,false))
    }

    override fun getItemCount(): Int = nikkeList.size

    override fun onBindViewHolder(holder: WaifuNikkeViewHolder, position: Int) {
        val item = nikkeList[position]
        holder.render(item,onClickListener,onClickDelete)
    }
}