package com.rafaeluribe.ejemploviewmodel1

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val numeroSuerte: MutableLiveData<String> = MutableLiveData()

    fun onBtnClick(){
        val random: Double = Math.random()
        val random0a100: Int = (random * 100).toInt()
        numeroSuerte.value = random0a100.toString()
    }

    override fun onCleared() {
        Log.d("ESTADO", "onCleared()")
        Log.d("ESTADO", "MainViewModel fue eliminado")
        super.onCleared()
    }
}