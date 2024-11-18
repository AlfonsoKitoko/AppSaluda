package com.amk.appsaluda

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SaludoActivity : AppCompatActivity(){
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_saludo)

		val txtSaludo:TextView = findViewById(R.id.TxtSaludo)
		//Recibe la cadena NOMBRE de la MainActivity y la muestra en pantalla actualizando el texto de Saludo
		val mensajeRecibido = intent.getStringExtra("NOMBRE")
		txtSaludo.text = "Hola $mensajeRecibido"
	}
}
//Alfonso Martínez Kitoko