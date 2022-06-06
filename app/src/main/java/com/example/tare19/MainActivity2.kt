package com.example.tare19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //Se asigna el cliente del navegador chrome para luego abrir la vista del navegador le habilitamos el javascrip y le asignamos a variable
        wbCanva.webChromeClient = object : WebChromeClient(){
        }
        wbCanva.webViewClient = object : WebViewClient(){
        }
        wbCanva.settings.javaScriptEnabled = true

        wbCanva.loadUrl("https://estudiantes.ugb.edu.sv/Home")
    }
}