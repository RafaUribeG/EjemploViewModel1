package com.rafaeluribe.ejemploviewmodel1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.rafaeluribe.ejemploviewmodel1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var b : ActivityMainBinding

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

        Log.d("ESTADO", "onCreate()")

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        b.btnRoll.setOnClickListener {
            mainViewModel.onBtnClick()
        }

        mainViewModel.numeroSuerte.observe(this, Observer {
            b.tvLuckyNumber.text = it
        })

    }

    override fun onStart(){
        Log.d("ESTADO", "onStart()")
        super.onStart()
    }

    override fun onResume() {
        Log.d("ESTADO", "onResume()")
        super.onResume()
    }

    override fun onPause() {
        Log.d("ESTADO", "onPause()")
        super.onPause()
    }

    override fun onStop() {
        Log.d("ESTADO", "onStop()")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d("ESTADO", "onDestroy()")
        super.onDestroy()
    }
}