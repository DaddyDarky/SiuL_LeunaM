package com.example.siul_leunam.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.siul_leunam.R
import com.example.siul_leunam.WaifuNikke
import com.example.siul_leunam.databinding.ItemWaifunikkeBinding

class WaifuNikkeViewHolder(view: View):RecyclerView.ViewHolder(view){

    val binding = ItemWaifunikkeBinding.bind(view)
     /*
    val nombre_Nikke = view.findViewById<TextView>(R.id.tv_nombreNikke)
    val arma_Nikke = view.findViewById<TextView>(R.id.tv_armaNikke)
    val clase_Nikke = view.findViewById<TextView>(R.id.tv_claseNikke)
    val foto_Nikke = view.findViewById<ImageView>(R.id.iv_fotoNikke)
     */
    fun render(waifuNikkeModel: WaifuNikke,onClickListener:(WaifuNikke)->Unit){
        binding.tvNombreNikke.text = waifuNikkeModel.nikke
         binding.tvArmaNikke.text = waifuNikkeModel.arma
        binding.tvClaseNikke.text = waifuNikkeModel.clase
         //binding.ivEliminarNikke.

        Glide.with(binding.ivFotoNikke.context).load(waifuNikkeModel.photo).into(binding.ivFotoNikke)
        binding.ivFotoNikke.setOnClickListener{onClickListener(waifuNikkeModel)}



    }


}