package com.example.projekt_to_do_list_01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.commit
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projekt_to_do_list_01.databinding.ActivityListaZadanBinding

class ListaZadan : AppCompatActivity() {
    private lateinit var binding: ActivityListaZadanBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListaZadanBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = FirstAdapter(stworzZadania())
        binding.RVListaZadan.layoutManager = LinearLayoutManager(applicationContext)
        binding.RVListaZadan.adapter = adapter


        binding.powrotDoMenu.setOnClickListener(){

            val explicitIntent = Intent(applicationContext,MainActivity::class.java)
            startActivity(explicitIntent)
        }


        val zadanie_Szczegoly = Zadanie_Szczegoly()
        binding.przyciskSzczegoly.setOnClickListener(){
            supportFragmentManager.commit {
                add(R.id.pojemnik_zadanie_szczegoly, zadanie_Szczegoly , null)
            binding.przyciskSzczegoly.visibility = View.INVISIBLE
            binding.powrotDoMenu.visibility = View.INVISIBLE
            }
        }


    }

    private fun stworzZadania(): List<Zadanie> = buildList {
        for(i in 0..500){
            val noweZadanie = Zadanie("$i","$i")
            add(noweZadanie)
        }
    }


}