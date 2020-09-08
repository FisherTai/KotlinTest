package com.fisher.kotlintest.rps

import android.widget.RadioGroup
import com.fisher.kotlintest.BaseActivity
import com.fisher.kotlintest.R
import com.google.android.material.textfield.TextInputEditText

class RpsActivity : BaseActivity() {

    var editName : TextInputEditText? = null
    var rpsRadio : RadioGroup? = null

    override fun getLayoutView(): Int = R.layout.rps_activity

    override fun findView() {
        editName = findViewById(R.id.et_name);
        rpsRadio = findViewById(R.id.radioGroup_rps);
    }
}