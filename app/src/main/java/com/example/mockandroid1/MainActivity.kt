package com.example.mockandroid1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mockandroid1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //initialize UI

        initUI()
    }

    private fun initUI() {


    }
}