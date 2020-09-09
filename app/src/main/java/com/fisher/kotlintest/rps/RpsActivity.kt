package com.fisher.kotlintest.rps

import android.text.TextUtils
import android.view.Gravity
import android.widget.TableRow
import android.widget.TextView
import com.fisher.kotlintest.BaseActivity
import com.fisher.kotlintest.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.rps_activity.*

class RpsActivity : BaseActivity(), RpsContract.View {

    private var presenter: RpsContract.Presenter? = null

    override fun getLayoutView(): Int = R.layout.rps_activity


    override fun handleView() {
        var rpsSelected: Int? = null

        setPresenter()
        radioGroup_rps!!.setOnCheckedChangeListener { radioGroup, i ->
            rpsSelected = i
        }

        btn_star.setOnClickListener {

            if (TextUtils.isEmpty(et_name!!.text.toString()) || rpsSelected == null) {
                Snackbar.make(
                    findViewById(android.R.id.content),
                    "Missing information",
                    Snackbar.LENGTH_SHORT
                ).show()
            } else {
                presenter!!.RpsHandle(et_name!!.text.toString(), rpsSelected!!)
            }

            et_name!!.clearFocus()
        }
    }

    override fun setPresenter() {
        presenter = RpsPresenter(this)
    }

    override fun showResult(rpsModel: RpsModel) {


        var tr = TableRow(this)
        var tvMyProduce = TextView(this)
        var tvPcProduce = TextView(this)
        var tvWin = TextView(this)
        var tvName = TextView(this)

        tvMyProduce.gravity = Gravity.CENTER
        tvMyProduce.text = rpsModel.myProduce

        tvPcProduce.gravity = Gravity.CENTER
        tvPcProduce.text = rpsModel.pcProduce

        tvWin.gravity = Gravity.CENTER
        tvWin.text = rpsModel.result

        tvName.gravity = Gravity.CENTER
        tvName.text = rpsModel.player

        tr.addView(tvName)
        tr.addView(tvWin)
        tr.addView(tvMyProduce)
        tr.addView(tvPcProduce)
        table_layout.addView(tr)

    }


    override fun onDestroy() {
        super.onDestroy()
        if (presenter != null) {
            presenter?.detachView()
        }
    }
}