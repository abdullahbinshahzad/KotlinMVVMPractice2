package com.example.kotlinmvvmpractice2.viewmodel

import androidx.lifecycle.ViewModel
import com.example.kotlinmvvmpractice2.model.CalculatorData

class CalculatorViewModel: ViewModel() {
    fun calculate(num1 : Int, num2 : Int): CalculatorData {
        val sum = num1 + num2
        return CalculatorData(num1, num2, sum)
    }
}