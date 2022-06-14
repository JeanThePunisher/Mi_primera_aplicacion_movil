package com.example.mi_primera_aplicacion_movil

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var boton = findViewById<Button>(R.id.btn1)
        var nombre = findViewById<TextView>(R.id.txtboxname)
        var genero = findViewById<RadioButton>(R.id.rb1)
        var genero2 = findViewById<RadioButton>(R.id.rb2)
        var fecha = findViewById<TextView>(R.id.txtboxdate)
        var celular = findViewById<TextView>(R.id.txtboxcell)
        boton.setOnClickListener{
            val intent = Intent(this@MainActivity, RecibeInfo::class.java)
            var dato1: String = nombre.text.toString()
            var dato2: String = genero.text.toString()
            var dato3: String = genero2.text.toString()
            var dato4: String = fecha.text.toString()
            var dato5: String = celular.text.toString()
            val b : Bundle = Bundle()
            b.putString("dt1",dato1)
            b.putString("dt2",dato2)
            b.putString("dt3",dato3)
            b.putString("dt4",dato4)
            b.putString("dt5",dato5)
            intent.putExtras(b)
            startActivity(intent)

        }
    }

}