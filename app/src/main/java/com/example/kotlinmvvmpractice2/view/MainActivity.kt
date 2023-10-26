package com.example.kotlinmvvmpractice2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinmvvmpractice2.R
import com.example.kotlinmvvmpractice2.databinding.ActivityMainBinding
import com.example.kotlinmvvmpractice2.hidekeyboard
import com.example.kotlinmvvmpractice2.model.CalculatorData
import com.example.kotlinmvvmpractice2.viewmodel.CalculatorViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var calculatorViewModel: CalculatorViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        calculatorViewModel = ViewModelProvider(this).get(CalculatorViewModel::class.java)

        binding.calculateBtn.setOnClickListener {
            val num1 = binding.num1.text.toString().toIntOrNull() ?: 0
            val num2 = binding.num2.text.toString().toIntOrNull() ?: 0

            val result = calculatorViewModel.Calculate(num1, num2)

            binding.result.text = "${result.result}"

            hidekeyboard()
        }
    }
}