package com.example.myapplication.Kotlin

// 08. 제어흐름
// - if, else

fun main(args: Array<String>) {
    val a: Int = 5
    val b: Int = 10

//    if/else 사용하는 방법 (1)
    if (a > b) {
//        (1) 1R
        println("a가 b보다 크다.")
    } else {
//        (1) 2R
        println("a가 b보다 작다.")
    }
    println("-------1-end------------------")
    println()
    println()
    println()
//    if/else 사용하는 방법 (2)
    if (a > b) {
        println("a가 b 보다 크다.")
    }

//    if (a > b) println("a가 b 보다 크다.")
//    윗줄 처럼 함수의 내용이 적을 경우 축약해서 써우도 된다.

    println("-------2-end------------------")
    println()
    println()
    println()
//    if/else/else if 사용 하는 방법
    if (a > b) {
        println("a가 b보다 크다.")
    } else if (a < b) {
        println("a가 b보다 작다.")
    } else {
        println("a와 b는 같다.")
    }
//    else if (a == b) {}

//    값을 리턴하는 if 사용법
    println()
    println("-----return if-----")
    val max = if (a > b) {
        a // = 5
    } else {
        b // = 10
    }
    println()
    println(max)

//    값을 리턴하는 if 사용법(2)
    println()
    println("-----return if(2)-----")
    val max2 = if (a < b) a else b
    println()
    println(max2)

}
