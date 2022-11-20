package com.example.projekt_to_do_list_01

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.projekt_to_do_list_01.databinding.FragmentZadanieSzczegolyBinding

class Zadanie_Szczegoly : Fragment() {
    private var _binding:FragmentZadanieSzczegolyBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment


        _binding = FragmentZadanieSzczegolyBinding.inflate(layoutInflater,container,false)
        return binding.root
    }



    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }


}