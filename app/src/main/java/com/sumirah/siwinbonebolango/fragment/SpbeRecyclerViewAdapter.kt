package com.sumirah.siwinbonebolango.fragment

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.sumirah.siwinbonebolango.R
import com.sumirah.siwinbonebolango.model.Spbe
import kotlinx.android.synthetic.main.activity_spbelist.view.*

class SpbeRecyclerViewAdapter(private val list: MutableList<Spbe>,
                              private val listener: (Spbe) -> Unit) : RecyclerView.Adapter<SpbeRecyclerViewAdapter.SPBEViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): SPBEViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.activity_spbelist, p0, false)
        return SPBEViewHolder(view)
    }

    override fun getItemCount(): Int  = list.size

    override fun onBindViewHolder(p0:SPBEViewHolder, p1: Int) {
        p0.bindItem(list[p1], listener)
    }

    class SPBEViewHolder(view: View) : RecyclerView.ViewHolder(view) {

//        val txtnamaAplikasi = view.find<TextView>(R.id.txt_nama_aplikasi)
//        val txtnamaInstansi = view.find<TextView>(R.id.txt_nama_instansi)


        fun bindItem(e: Spbe, listener: (Spbe) -> Unit) {
            itemView.txt_nama_aplikasi.text = e.namaAplikasi
            itemView.txt_nama_instansi.text = e.namaInstansi

//            txtnamaAplikasi.text = e.namaAplikasi
//            txtnamaInstansi.text = e.namaInstansi


            itemView.setOnClickListener {
                listener(e)
            }
        }

    }

//    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
//        fun bindItem(items : Item, listener : (Item) -> Unit){
//            itemView.name.text = items.name
//            Glide.with(itemView.context).load(items.image).into(itemView.image)
//
//            itemView.setOnClickListener{
//                listener(items)
//            }
//        }
//    }


}