package com.example.kotlinmvvmpractice2

import android.content.Context
import android.view.inputmethod.InputMethodManager
import com.example.kotlinmvvmpractice2.view.MainActivity


fun MainActivity.hidekeyboard(){
    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    val view = currentFocus ?:window.decorView
    imm.hideSoftInputFromWindow(view.windowToken, 0)
}