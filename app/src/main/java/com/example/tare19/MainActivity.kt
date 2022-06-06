package com.example.tare19

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.pm.ShortcutInfoCompat
import androidx.core.content.pm.ShortcutManagerCompat
import androidx.core.graphics.drawable.IconCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Se crea el evento CLICk Se coloca la funcion
        btnCrear.setOnClickListener {
            crearshortcut()
        }
    }


    //la funcion que crea un acceso directo
    fun crearshortcut(){
        //Se compara si soporta el acceso direvto y aso se crea una variable que construye el acceso directo luego Se setea un intent y el intent que abrira
        if (ShortcutManagerCompat.isRequestPinShortcutSupported(applicationContext)) {
            val shortcutInfo = ShortcutInfoCompat.Builder(applicationContext, "#1")
                .setIntent(
                    Intent(
                        applicationContext,
                        MainActivity::class.java
                    ).setAction(Intent.ACTION_MAIN)
                )
                //Se selecciona lo que dira el acceso directo
                .setShortLabel("AppUGB")
                .setIcon(IconCompat.createWithResource(applicationContext, R.drawable.logougb))
                .build()
            ShortcutManagerCompat.requestPinShortcut(applicationContext, shortcutInfo, null)
        } else {

            Toast.makeText(
                this@MainActivity,
                "no puedo ejecutarlo pesa mucho",
                Toast.LENGTH_LONG
            ).show()
        }
    }
}