package com.fisher.kotlintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.fisher.kotlintest.rps.RpsActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), View.OnClickListener {

    override fun getLayoutView(): Int = R.layout.activity_main

    override fun handleView() {
        btn_open_rps.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btn_open_rps -> {
                var intent = Intent(this, RpsActivity::class.java)
                startActivity(intent)
            }
        }

    }
}
