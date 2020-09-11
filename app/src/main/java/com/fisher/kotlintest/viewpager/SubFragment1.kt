package com.fisher.kotlintest.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SubFragment1 : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var View = layoutInflater.inflate()


        return super.onCreateView(inflater, container, savedInstanceState)
    }
}