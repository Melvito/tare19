package com.example.tare19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        //Se asigna el cliente del navegador chrome para luego abrir la vista del navegador le habilitamos el javascrip y le asignamos a variable
        wbNotas.webChromeClient = object : WebChromeClient(){
        }
        wbNotas.webViewClient = object : WebViewClient(){
        }
        wbNotas.settings.javaScriptEnabled = true
        wbNotas.loadUrl("https://estudiantes.ugb.edu.sv/Notas")

    }
}