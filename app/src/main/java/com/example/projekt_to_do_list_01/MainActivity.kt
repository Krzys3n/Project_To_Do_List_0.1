package com.example.projekt_to_do_list_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.projekt_to_do_list_01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding //binding czyli klasa służąca do odwoływania się do id elementów xml z kodu kotlinowego, można edytować każdy kompenent
    private val mainVm by viewModels<MainViewModel>() // linijka potrzebna do odpalenia viewmodel który jest naszym pojeminkiem na zmienne


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // "rozdmuchanie" klasy binding czyli klasa służąca do odwoływania się do id elementów xml z kodu kotlinowego, można edytować różne komponenty
        setContentView(binding.root)

        binding.nazwaAplikacji.text = "To Do List wersja: "+mainVm.randomowaZmiennaDouble  // przykład użycia binding, bez bindingu nie moglibyśmy się dostać do naszego komponentu.
    }
}