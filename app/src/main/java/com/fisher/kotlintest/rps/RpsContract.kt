package com.fisher.kotlintest.rps

import com.fisher.kotlintest.BaseView

interface RpsContract {

    interface View : BaseView {
        //顯示猜拳結果
        fun showResult(rpsModel : RpsModel)
    }

    interface  Presenter{
        //處理猜拳結果
        fun RpsHandle(name: String , myProduce : Int)
        //勝負判斷
        fun judgeResult(myProduce: Int, pcProduce: Int):String
        //將結果及出拳轉換為字串
        fun changeTypeToString(RpsOrJudge: Int): String

        fun detachView()
    }

}