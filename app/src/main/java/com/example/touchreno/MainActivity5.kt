package com.example.touchreno
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val chair : String="https://drive.google.com/uc?export=download&id=12H3Xw-9r-H16eT8qm6LKkqra8Hvm5YML"
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        val ARr : Button=findViewById(R.id.ar)
        ARr.setOnClickListener {
            val intent = Intent(this, Ar::class.java)
            intent.putExtra("message_key", chair)
            startActivity(intent)
        }
    }
}