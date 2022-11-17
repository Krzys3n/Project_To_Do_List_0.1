package com.example.projekt_to_do_list_01

import androidx.lifecycle.ViewModel
//viewModel to pojemnik na zmienne dzięki któremu nie będziemy tracić danych przy obracaniu ekranu
// i niszczeniu poszczególnych aktywności

class MainViewModel : ViewModel() {
    var randomowaZmiennaDouble: Double = 0.1

}