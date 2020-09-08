package com.fisher.kotlintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.fisher.kotlintest.rps.RpsActivity

class MainActivity : BaseActivity(), View.OnClickListener {

    override fun getLayoutView(): Int = R.layout.activity_main

    override fun findView() {
        findViewById<View>(R.id.btn_open_rps).setOnClickListener(this)
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
