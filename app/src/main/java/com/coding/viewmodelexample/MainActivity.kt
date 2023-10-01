package com.coding.viewmodelexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private val counterViewModel: CounterWithLivedataViewModel by lazy {
        ViewModelProvider(this)[CounterWithLivedataViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val incBtn = findViewById<Button>(R.id.incBtn)

        val counterText = findViewById<TextView>(R.id.counterText)

        counterViewModel.getCounter.observe(this){counter ->
            counterText.text = counter.toString()
        }



//        setValue()
        incBtn.setOnClickListener {
            counterViewModel.incCounter()
//            setValue()

        }

        val decBtn = findViewById<Button>(R.id.decBtn)

        decBtn.setOnClickListener {
            counterViewModel.decCounter()
//            setValue()

        }
    }

//    private fun setValue() {
//        val counterText = findViewById<TextView>(R.id.counterText)
//        counterText.text = counterViewModel.getCounter().toString()
//    }

}