package com.fisher.kotlintest.kotlin

class FunctionAndPrint {

    private val a: Int = 1  // val為常數，並指定型態為Int
    private val b = 2      //省略型態指定
    private var c = 3      //var為變數

    fun main() {  //入口函式
        println(a + b + c) //return 5
        println("" + a + b + c) //return 122
        println("$a $b $c") //return 1 2 2
        printMessage("Hello") //return Hello
        printMessageWithPrefix("Hello", "Log") //return  [Log] Hello
        printMessageWithPrefix("Hello") //return [Info] Hello
        printMessageWithPrefix(prefix = "Log2", message = "Hello2") //return [Log2] Hello2
        println(sum(1, 2)) //return 3
        println(multiply(3, 4)) //return 12

    }

    /**
     * fun "function_name" ("value_name" : input type) : return type

     * return type後為回傳型態，若為Unit可省略不寫。(Unit表示無回傳)
     */
    fun printMessage(message: String): Unit {
        println(message)
    }

    /**
     * 傳入參數為副數時，使用逗號隔開
     */
    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    /**
     * 給予參數prefix的預設值為"Info"
     * 字串符號""中的參數，使用"+"串接或"$"標示
     */
    fun printMessageWithPrefix(message: String, prefix: String = "Info") {
        println("[$prefix] $message")
    }

    //也可使用 "="宣告單行式的函數
    fun multiply(x: Int, y: Int) = x * y



}