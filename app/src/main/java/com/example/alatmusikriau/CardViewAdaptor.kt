package com.example.alatmusikriau

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewAdaptor(private val listInstrument: ArrayList<Instrument> ) : RecyclerView.Adapter<CardViewAdaptor.CardViewViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(data: Instrument)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_instrument,parent,false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listInstrument.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
         val instrument = listInstrument[position]

        Glide.with(holder.itemView.context)
            .load(instrument.photo)
            .apply(RequestOptions().override(350,550))
            .into(holder.imgPhoto)
        holder.tvname.text = instrument.name
        holder.tvdetail.text = instrument.detail

        holder.btnDetail.setOnClickListener{
            onItemClickCallback.onItemClicked(listInstrument[holder.adapterPosition])
            //Toast.makeText(holder.itemView.context,"detail" + listInstrument[holder.adapterPosition].name,Toast.LENGTH_SHORT).show()
        }

    }

    inner class CardViewViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
           var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
           var tvname: TextView = itemView.findViewById(R.id.tv_instrument_name)
           var tvdetail: TextView = itemView.findViewById(R.id.tv_instrument_detail)
           var btnDetail: Button = itemView.findViewById(R.id.btn_detail)
    }
}