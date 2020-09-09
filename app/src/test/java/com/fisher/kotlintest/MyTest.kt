package com.fisher.kotlintest

import org.junit.Test


class MyTest {

    val ROCK = 11
    val PAPAER = 12
    val SCISSORS = 13


    @Test
    fun start(){
     for (i in 1..10){
         judgeWinn()
        }
    }

    fun judgeWinn() {
        var myProduce =  (11..13).random()
        var pcProduce = (11..13).random()

        if (pcProduce==myProduce) {
            println("$myProduce $pcProduce tie")
        } else if ( myProduce < pcProduce && myProduce-pcProduce != -2 || myProduce - pcProduce == 2) {
            println("$myProduce $pcProduce lose")
        } else {
            println("$myProduce $pcProduce win")
        }
    }

}