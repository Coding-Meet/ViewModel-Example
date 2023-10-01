package com.coding.viewmodelexample

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class CounterViewModel(application: Application) : AndroidViewModel(application) {

    private var counter = 0


    fun incCounter(){
     counter++
    }

    fun decCounter(){
        counter--
    }

    fun getCounter(): Int{
        return counter
    }

}