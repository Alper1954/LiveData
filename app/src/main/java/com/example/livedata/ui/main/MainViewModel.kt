package com.example.livedata.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val usd_to_eu_rate = 0.74f

    private var _result: MutableLiveData<Float> = MutableLiveData()
    val result: LiveData<Float>
        get() = _result

    fun setAmount(value: String) {
        _result.value = value.toFloat() * usd_to_eu_rate
    }
}