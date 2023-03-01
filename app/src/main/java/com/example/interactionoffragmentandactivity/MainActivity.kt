package com.example.interactionoffragmentandactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.interactionoffragmentandactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var userInterface:UserInterface
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.fragmentcontainer1.setOnClickListener {

        }

        binding.btnplus.setOnClickListener {
            userInterface.PlusFragment()
        }

        binding.btnminus.setOnClickListener {
              userInterface.MinusFragment()
        }

    }

    }