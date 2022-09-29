package com.example.hw45

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.hw45.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.result.observe(this) {
            binding.countTv.text = it.toString()
        }
        initClicker()
    }

    private fun initClicker() {
        binding.plusBtn.setOnClickListener {
            viewModel.plusBtn()
        }

        binding.minusBtn.setOnClickListener {
            viewModel.minusBtn()
        }
    }

}