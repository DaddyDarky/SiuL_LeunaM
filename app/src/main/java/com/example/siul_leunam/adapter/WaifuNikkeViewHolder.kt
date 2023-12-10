package com.example.siul_leunam.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.siul_leunam.R
import com.example.siul_leunam.WaifuNikke

class WaifuNikkeViewHolder(view: View):RecyclerView.ViewHolder(view){

    val nombre_Nikke = view.findViewById<TextView>(R.id.tv_nombreNikke)
    val arma_Nikke = view.findViewById<TextView>(R.id.tv_armaNikke)
    val clase_Nikke = view.findViewById<TextView>(R.id.tv_claseNikke)
    val foto_Nikke = view.findViewById<ImageView>(R.id.iv_fotoNikke)
    fun render(waifuNikkeModel: WaifuNikke){
        nombre_Nikke.text = waifuNikkeModel.nikke
        arma_Nikke.text = waifuNikkeModel.arma
        clase_Nikke.text = waifuNikkeModel.clase
    }
}