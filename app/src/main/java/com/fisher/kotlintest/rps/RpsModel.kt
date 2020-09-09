package com.fisher.kotlintest.rps

class RpsModel (player:String){

    /**
     * 參數宣告時已經默認了getter及setter，
     * 可使用getter()或setter()改寫內容，需寫在該變數宣告的下一行，或是使用;分開
     * 也可使用可見修飾子來設定get、set。EX: private set get
     */
    internal var player : String = player
    internal var result : String? = null
    internal var myProduce : String? = null
    internal var pcProduce : String? = null
}