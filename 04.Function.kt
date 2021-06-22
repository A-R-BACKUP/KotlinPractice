package com.example.myapplication.Kotiln

// 04. Function
// - 함수
//  - 어떤 input을 넣어주면 어떤 output 나오는 것.
//      - y = x + 2

// - 함수를 선언하는 방법
// fun 함수명 (변수명: 타입, 변수명: 타입 ...) : 변환형 {
//          함수 내용
//          return 반환값
//}

fun plus(first : Int, second: Int): Int {
    println("--------")
    println("first: " + first)
    println("second: " + second)
    println("--------")
    println("")
    println("Result")
    val a : Int = first + second
    return a
}

// - 디폴트 값을 갖는 함수 만들기
fun plusFive(first : Int, second : Int = 5): Int {
    val b : Int = first + second
    return b
}


// - 반환값이 없는 함수 만들기
fun printPlus(first : Int, second : Int): Unit {
    val c : Int = first + second
    println(c)
}


fun main(array: Array<String>){
    // 함수를 호출하는 방법

    val result = plus(5, 10)
    println(result)
    // 인수를 명시적으로 전달하는 방법

    // result = plus(5+10)

    // result2 = plus(20+30)

    val result2 = plus(first = 20, second = 30)
    println(result2)

    val result3 = plus(second = 100, first = 10)
    println(result3)




    // 디폴트 값을 갖는 함수 호출하기
    println()
    println()
    println()
    println("default Line")
    val result4 = plusFive(10, 20)
    println("--result4--")
    println(result4)
    val result5 = plusFive(10)
    println("--result5--")
    println(result5)

}
