package ru.geekbrains.kotlin_1_11012021

import java.util.*

class BeerExpert {
    fun getBrands(color: String): List<String> {
        val brands: MutableList<String> = ArrayList()
        if (color == "light") {
            brands.add("Lager Light")
            brands.add("Pilsner German")
        }
        if (color == "amber") {
            brands.add("Jack Amber")
            brands.add("Red Moose")
        }
        if (color == "brown") {
            brands.add("Altbier")
            brands.add("Brown Ale English")
        }
        if (color == "dark") {
            brands.add("Lager European Dark")
            brands.add("Dubbel")
        }
        return brands
    }
}