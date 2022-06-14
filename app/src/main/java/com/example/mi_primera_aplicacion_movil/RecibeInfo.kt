package com.example.mi_primera_aplicacion_movil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class RecibeInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recibe_info)

        var recibe = findViewById<TextView>(R.id.txtrecibe)

        var bundle = intent.extras
        if (bundle != null) {
            recibe.text= bundle.getString("dt1" + "dt2" +  "dt3" +  "dt4" +  "dt5")
        }

    }
}