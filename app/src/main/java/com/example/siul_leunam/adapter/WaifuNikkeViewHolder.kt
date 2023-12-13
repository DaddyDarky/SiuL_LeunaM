package com.example.siul_leunam.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.siul_leunam.WaifuNikke
import com.example.siul_leunam.databinding.ItemWaifunikkeBinding

class WaifuNikkeViewHolder(view: View):RecyclerView.ViewHolder(view){

    val binding = ItemWaifunikkeBinding.bind(view)

    fun render(
         waifuNikkeModel: WaifuNikke,
         onClickListener: (WaifuNikke) -> Unit,
         onClickDelete: (Int) -> Unit
     ){
        binding.tvNombreNikke.text = waifuNikkeModel.nikke
         binding.tvArmaNikke.text = waifuNikkeModel.arma
        binding.tvClaseNikke.text = waifuNikkeModel.clase
         //binding.ivEliminarNikke.

        Glide.with(binding.ivFotoNikke.context).load(waifuNikkeModel.photo).into(binding.ivFotoNikke)
        binding.ivFotoNikke.setOnClickListener{onClickListener(waifuNikkeModel)}
         binding.ivEliminarNikke.setOnClickListener{onClickDelete(adapterPosition)}



    }


}