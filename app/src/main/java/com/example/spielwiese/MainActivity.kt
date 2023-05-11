package com.example.spielwiese

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Switch
import android.widget.Toast
import com.example.spielwiese.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val deinName : String = "Hans"

        Log.d("name", "$deinName")

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.uselessButton.setOnClickListener {
            Toast.makeText(this,"test", Toast.LENGTH_SHORT).show()
        }
    }
}