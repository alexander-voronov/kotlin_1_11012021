package ru.geekbrains.kotlin_1_11012021

import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private val expert = BeerExpert()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickFindBeer(view: View?) {
        val brands = findViewById<View>(R.id.brands) as TextView
        val color = findViewById<View>(R.id.color) as Spinner
        val beerType = color.selectedItem.toString()
        val brandList: List<String> = expert.getBrands(beerType)
        val brandsFormatted = StringBuilder()
        for (brand in brandList) {
            brandsFormatted.append(brand).append('\n')
        }
        brands.text = brandsFormatted
    }
}