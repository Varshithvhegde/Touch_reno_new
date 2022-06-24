package com.example.touchreno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Elamp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val lamp : String="https://drive.google.com/uc?export=download&id=1MjxNaq5tnbAFJQ58P2hEll_sXQCNGW_4"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elamp)
        val ARr : Button =findViewById(R.id.ar)
        ARr.setOnClickListener {
            val intent = Intent(this, Ar::class.java)
            intent.putExtra("message_key", lamp)
            startActivity(intent)
        }
    }
}