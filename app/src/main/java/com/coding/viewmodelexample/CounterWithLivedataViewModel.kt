package com.coding.viewmodelexample

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class CounterWithLivedataViewModel(application: Application) : AndroidViewModel(application){
    
    private val counter : MutableLiveData<Int> = MutableLiveData(0)

    val getCounter : LiveData<Int>
        get() = counter
    
    
    fun incCounter(){
        counter.postValue(counter.value!! + 1)
    }

    fun decCounter(){
        counter.postValue(counter.value!! - 1)
    }
}