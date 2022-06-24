package com.example.touchreno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Sofa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val sofa : String="https://drive.google.com/uc?export=download&id=1RIEeo7pqa5SVeV4eP9Twhh3RL_UPjSdZ"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sofa)
        val ARr : Button =findViewById(R.id.ar)
        ARr.setOnClickListener {
            val intent = Intent(this, Ar::class.java)
            intent.putExtra("message_key", sofa)
            startActivity(intent)
        }
    }
}