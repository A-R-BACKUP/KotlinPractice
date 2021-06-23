package com.example.myapplication.Kotlin

fun plusThree(first: Int, second: Int, third: Int): Int {
//    val a = first + second + third
//    result a기
//    또는 바로 리턴하
    return first + second + third
}

fun minusThree(first: Int, second: Int, third: Int) = first - second - third

fun multiplyThree(first: Int = 1, second: Int = 1, third: Int = 1): Int {
    return first * second * third
}

// 내부 함수
// - 함수 안에 함수가 있다.
fun showMyplus(first: Int, second: Int): Int {
    println("first: " + first)
    println("second: " + second)

//    return first + second

    fun plus(first: Int, second: Int): Int {
        return first + second
    }
    return plus(first, second)
}

fun main(array: Array<String>) {
    val z = plusThree(1, 2, 3)
    println(z)
    println()
    val y = minusThree(10, 1, 2)
    println(y)
    println()
    val x = multiplyThree(2, 2, 2)
    println(x)
    println()
    val w = multiplyThree()
    println(w)


    println()
    println("showMyplus Line")
    val v = showMyplus(4, 5)
    println("result: " + v)

}