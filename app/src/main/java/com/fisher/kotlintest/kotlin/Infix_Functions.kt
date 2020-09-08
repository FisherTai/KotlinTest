package com.fisher.kotlintest.kotlin

class Infix_Functions {


    fun main() {
        //中綴擴展函式 (infix extension function) : 擴展Int.times()的功能
        infix fun Int.times(str: String) = str.repeat(this)
        /**
         * 這裡擴展功能中使用到 repeat(n: Int): String，會將字串串接 n 次後傳回。
         * 傳入的參數就是呼叫此function自身的Int對象，故這裡串接2次
         * 中綴表示法 : 2 times "Bye " 與 2.times("Bye ")的寫法相同
         */
        println(2 times "Bye ") //print Bye Bye

        /**
         * 這裡使用了<A,B> A.to(that : B)傳回了 Pair<A,B>物件
         * Pair下的toString會傳回 "($first, $second)" 格式的字串
         */
        val pair = "Ferrari" to "Katrina"
        println(pair)  //print (Ferrari, Katrina)

        /**
         * 在String下擴展出一個onto()函式，其作用與上面的to()相同
         */
        infix fun String.onto(other: String) = Pair(this,other)
        val myPair = "Mclaren" onto "Lucats"
        println(myPair) //print (McLaren, Lucas)

        val sophia = Person("Sophia")
        val claudia = Person("Claudia")

        //sophia.likes(claudia)，中綴表示法也能使用在成員函式
        sophia likes claudia
    }

    class Person(val name: String) {
        val likePeople = mutableListOf<Person>()
        infix fun likes(other: Person) {
            likePeople.add(other)
        }
    }
}