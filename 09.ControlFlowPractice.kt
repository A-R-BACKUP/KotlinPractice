package com.example.myapplication.Kotlin

fun main(args:Array<String>){

    val a: Int? = null
    val b: Int = 10
    val c: Int = 100

    if (a == null){
        println("a is null")
    } else {
        println("a is not null")
    }

    if (b + c == 110) {
        println("b plus c is 110")
    } else {
        println("b plus c is not 110")
    }

    // 엘비스 연산자
    println()
    println("Elvis Operator Example")
    val number: Int? = null
    val number2 = number ?: 10
    println("----------")
    println(number2)
    println("----------")

    //엘비스 연산자 연습
    println()
    println("Elvis Operator Practice")
    val exnum: Int? = null
    val exnum2 = exnum ?: 999
    println("----------")
    println(exnum2)
    println("----------")

    //값을 리턴하는 if를 응용한 연습(1)
    val num1 : Int = 10
    val num2 : Int = 20
    println()
    println("Return if Practice")
    val max = if (num1 > num2) {
        num1 // = 10
    } else if (num1 == num2)  {
        num2 // = 20
    }
    println()
    println(max)
}

// 제어흐름A 09:38