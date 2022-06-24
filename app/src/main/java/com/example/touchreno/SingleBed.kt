package com.example.touchreno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SingleBed : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val bed : String="https://drive.google.com/uc?export=download&id=1BuqzvDYjh6alSIlBlx9kqpEUYZ9KtSP3"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_bed)
        val ARr : Button =findViewById(R.id.ar)
        ARr.setOnClickListener {
            val intent = Intent(this, Ar::class.java)
            intent.putExtra("message_key", bed)
            startActivity(intent)
        }
    }
}