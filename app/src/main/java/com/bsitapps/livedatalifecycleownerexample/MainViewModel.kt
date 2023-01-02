package com.bsitapps.livedatalifecycleownerexample

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val timerData = MutableLiveData<String>()
    private val timer: CountDownTimer = object : CountDownTimer(60000, 3000) {
        override fun onTick(milliSecondsLeft: Long) {
            timerData.value = "$milliSecondsLeft"
        }

        override fun onFinish() {
            timerData.value = "Finished"
        }

    }

    fun startTimer() {
        timer.start()
    }

    override fun onCleared() {
        super.onCleared()
        timer.cancel()
    }
}