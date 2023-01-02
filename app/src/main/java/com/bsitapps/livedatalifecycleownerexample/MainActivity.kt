package com.bsitapps.livedatalifecycleownerexample

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mainViewModel: MainViewModel by viewModels()
        mainViewModel.timerData.observe(this) {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }
        mainViewModel.startTimer()
    }
}