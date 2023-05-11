package com.example.spielwiese

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Switch
import com.example.spielwiese.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val deinName : String = "Hans"

        Log.d("name", "$deinName")

        binding = ActivityMainBinding.inflate(layoutInflater);
        val view = binding.root
        setContentView(view)

        binding.txtMain.setText("An");

        binding.swtText.setOnCheckedChangeListener { _, isChecked ->
            switch(isChecked)
        };

    }

    private fun switch(switchOn: Boolean)
    {
        Log.d("Spielwiese","Test");
        if(switchOn)
        {
            binding.txtMain.setText("An");
        }
        else{
            binding.txtMain.setText("Aus");
        }

    }


}