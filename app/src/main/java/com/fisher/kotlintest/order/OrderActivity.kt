package com.fisher.kotlintest.order

import android.content.Intent
import android.text.TextUtils
import com.fisher.kotlintest.BaseActivity
import com.fisher.kotlintest.R
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : BaseActivity() {
    val ORDER_ACTIVITY: Int = 1
    override fun getLayoutView(): Int = R.layout.activity_order

    override fun handleView() {
        btn_jump.setOnClickListener {
            if (TextUtils.isEmpty(et_name.text)) {
                textInputLayout.error = "請輸入姓名"
                et_name.clearFocus()
            } else {
                textInputLayout.isErrorEnabled = false
                var intent = Intent(this, OrderCommitActivity::class.java)
                intent.putExtra("name",et_name.text.toString())
                startActivityForResult(intent, ORDER_ACTIVITY)
                et_name.clearFocus()
            }
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == ORDER_ACTIVITY){

            if(resultCode == IntentCode.ORDER_COMMIT_ACTIVITY){
                tv_drink.text = data?.getStringExtra("drink")
                tv_ice.text = data?.getStringExtra("ice")
                tv_sweet.text = data?.getStringExtra("sweet")
            }

        }
    }
}