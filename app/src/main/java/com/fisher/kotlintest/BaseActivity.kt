package com.fisher.kotlintest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutView())
        handleView()
    }

    abstract fun getLayoutView():Int
    abstract fun handleView()

}