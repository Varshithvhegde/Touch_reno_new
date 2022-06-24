package com.example.touchreno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class office_chair : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val chair : String="https://drive.google.com/uc?export=download&id=1avd4PBeZ09YzvmQmjJFXyEgHmZiWcDYj"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_office_chair)
        val ARr : Button =findViewById(R.id.ar)
        ARr.setOnClickListener {
            val intent = Intent(this, Ar::class.java)
            intent.putExtra("message_key", chair)
            startActivity(intent)
        }
    }
}