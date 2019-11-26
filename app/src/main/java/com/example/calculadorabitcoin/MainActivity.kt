package com.example.calculadorabitcoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.alert
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import java.net.URL

class MainActivity : AppCompatActivity() {
    val API_URL = "https://www.mercadobitcoin.net/api/BTC/ticker/"
    var cotacaoBitcoin: Double = 0.0
    fun buscaCotacao(){
        doAsync {
            val resposta = URL(API_URL).readText()
            uiThread {
                alert (resposta).show()
            }
        }


    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buscaCotacao()
    }
}
