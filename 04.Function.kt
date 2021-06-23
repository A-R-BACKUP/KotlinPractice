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

fun plus(first: Int, second: Int): Int {
    println("--------")
    println("first: " + first)
    println("second: " + second)
    println("--------")
    println("")
    println("Result")
    val a: Int = first + second
    return a
}

// - 디폴트 값을 갖는 함수 만들기
fun plusFive(first: Int, second: Int = 5): Int {
    val b: Int = first + second
    return b
}


// - 반환값이 없는 함수 만들기
// Unit을 붙이는 이유는 plusFive함수는 Return하지 않는다는 명령
// Unit은 생략 가능
fun printPlus(first: Int, second: Int): Unit {
    val c: Int = first + second
    println(c)
}


// - 반환값이 없는 함수 만들기 (2)
fun printPlus2(first: Int, second: Int) {
    val d: Int = first + second
    println(d)
}


// - 간단하게 함수를 선언하는 방법
fun plusShort(first: Int, second: Int) = first + second


// - 가변인자를 갖는 함수 선언하는 방법
fun plusMany(vararg numbers: Int) {
    for(number in numbers) {
        println(number)
    }
}

fun main(array: Array<String>) {
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


    //반환값이 없는 함수의 사용법
    println()
    println()
    println()
    println("No return Line")
    printPlus(10, 20)


    println()
    println("plusShort result")
    val result6 = plusShort(50, 50)
    println(result6)

    println()
    println("plusMany")
    plusMany(1, 2, 3)
    plusMany(100)
}

// 메소드B 8분 3초까지..