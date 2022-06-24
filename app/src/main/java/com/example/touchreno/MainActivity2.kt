package com.example.touchreno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.cardview.widget.CardView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val cardview = findViewById<CardView>(R.id.cactus_card_view)
        cardview.setOnClickListener(View.OnClickListener { view ->
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        })//
        val ofchair =findViewById<CardView>(R.id.ochair)
        ofchair.setOnClickListener(View.OnClickListener { view ->
            val intentc = Intent(this, office_chair::class.java)
            startActivity(intentc)
        })
        val bedr = findViewById<CardView>(R.id.bed)
        bedr.setOnClickListener(View.OnClickListener { view ->
            val intentb = Intent(this, SingleBed::class.java)
            startActivity(intentb)
        })
        val lampp = findViewById<CardView>(R.id.lamp)
        lampp.setOnClickListener(View.OnClickListener { view ->
            val intentl = Intent(this, Elamp::class.java)
            startActivity(intentl)
        })
        val sofaa= findViewById<CardView>(R.id.sofa)
        sofaa.setOnClickListener(View.OnClickListener { view ->
            val intents = Intent(this, Sofa::class.java)
            startActivity(intents)
        })
        val lamppp = findViewById<CardView>(R.id.catlamp)
        lamppp.setOnClickListener(View.OnClickListener { view ->
            val intentla= Intent(this, Elamp::class.java)
            startActivity(intentla)
        })
        val cchair = findViewById<CardView>(R.id.catchair)
        cchair.setOnClickListener(View.OnClickListener { view ->
            val intentla= Intent(this, MainActivity5::class.java)
            startActivity(intentla)
        })
    }
}