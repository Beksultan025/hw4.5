package com.example.hw45

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val result = MutableLiveData<Int>()
    var count = 0

    fun plusBtn() {

        count++
        result.value = count
    }

    fun minusBtn() {
        count--
        result.value = count
    }
}