package com.example.projekt_to_do_list_01

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.projekt_to_do_list_01.databinding.PojedynczeZadanieBinding

class FirstAdapter(private val zadania: List<Zadanie>):
    RecyclerView.Adapter<FirstAdapter.MyViewHolder>() {
    inner class MyViewHolder(binding: PojedynczeZadanieBinding): ViewHolder(binding.root){
        val nazwa = binding.nazwaZadania
        val data_zadania = binding.dataWykonaniaZadania
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val pojedyncze_zadanieBinding =  PojedynczeZadanieBinding.inflate(inflater,parent,false)
        return MyViewHolder(pojedyncze_zadanieBinding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.nazwa.text = zadania[position].nazwa_zadania
        holder.data_zadania.text = zadania[position].data_wykonania_zadania
    }

    override fun getItemCount(): Int {
        return zadania.size
    }
}