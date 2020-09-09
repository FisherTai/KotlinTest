package com.fisher.kotlintest.rps

import com.fisher.kotlintest.R
import java.lang.ref.Reference
import java.lang.ref.SoftReference
import kotlin.random.Random

/**
 * 單一的建構式可以直接寫在類別名的後面，例如
 * class RpsPresenter(var view: RpsContract.View)
 * }
 */
class RpsPresenter : RpsContract.Presenter {

    protected lateinit var mViewRef: Reference<RpsContract.View>

    constructor(view: RpsContract.View) {
        mViewRef = SoftReference<RpsContract.View>(view)
    }

    //出拳
    val ROCK = 11
    val PAPAER = 12
    val SCISSORS = 13


    override fun RpsHandle(name: String, myProduce: Int) {

        val mProduce =
            when (myProduce) {
                R.id.rb_r -> ROCK
                R.id.rb_p -> PAPAER
                else -> SCISSORS
            }

        //取11~13的隨機數，也可改成(11 unit 14)結果相同
        val pcProduce = (11..13).random()

        val rpsModel = RpsModel(name)
        rpsModel.myProduce = changeTypeToString(mProduce)
        rpsModel.pcProduce = changeTypeToString(pcProduce)
        rpsModel.result = judgeResult(mProduce, pcProduce)

        mViewRef.get()!!.showResult(rpsModel)
    }

    override fun changeTypeToString(RpsOrJudge: Int): String {
        when (RpsOrJudge) {
            ROCK -> return "Rock"
            PAPAER -> return "Papaer"
            SCISSORS -> return "Scissos"
            else -> return "Value Fail"
        }
    }

    override fun judgeResult(myProduce: Int, pcProduce: Int): String {
        if (pcProduce == myProduce) {
            return "TIE"
        } else if (myProduce < pcProduce && myProduce - pcProduce != -2 || myProduce - pcProduce == 2) {
            return "LOSE"
        } else {
            return "WIN"
        }
    }

    override fun detachView() {
        mViewRef.clear()
    }

}