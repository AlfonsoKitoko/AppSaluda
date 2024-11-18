package com.amk.appsaluda

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val txtNombre: EditText = findViewById(R.id.TxtNombre)
		val btnAceptar: Button = findViewById(R.id.BtnAceptar)

		btnAceptar.setOnClickListener {
			val intent = Intent(this, SaludoActivity::class.java)
			intent.putExtra("NOMBRE", txtNombre.text.toString())
			startActivity(intent)
		}
	}
}
//Alfonso Martínez Kitoko