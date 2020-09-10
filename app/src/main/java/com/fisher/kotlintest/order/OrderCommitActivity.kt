package com.fisher.kotlintest.order

import android.widget.RadioButton
import com.fisher.kotlintest.BaseActivity
import com.fisher.kotlintest.R
import kotlinx.android.synthetic.main.activity_order_list.*

class OrderCommitActivity : BaseActivity() {

    val ORDER_COMMIT_ACTIVITY = 2

    override fun getLayoutView(): Int = R.layout.activity_order_list

    override fun handleView() {
        val name = intent.extras?.get("name")
        tv_hello.text = "Hi! $name"

        rg_drink.setOnCheckedChangeListener { radioGroup, i ->
            intent.putExtra("drink", findViewById<RadioButton>(i).text)
        }
        rg_ice.setOnCheckedChangeListener { radioGroup, i ->
            intent.putExtra("ice", findViewById<RadioButton>(i).text)
        }

        rg_sweet.setOnCheckedChangeListener { radioGroup, i ->
            intent.putExtra("sweet", findViewById<RadioButton>(i).text)
        }

        btn_commit.setOnClickListener {
            setResult(ORDER_COMMIT_ACTIVITY,intent)
            finish()
        }
    }


}