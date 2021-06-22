package com.example.myapplication.Kotiln

var a = 1 + 2 + 3 + 4 + 5
// 연산의 결과값을 변수에 넣어 줄 수 있다.
var b = "1"
var c = b.toInt()
var d = b.toFloat()

var e = "John"
var f = "My name is $e Nice to meet you"
// $(함수)를 넣으면 그 함수 값이 출력되어진다.

// Null
// - 존재 하지 않는다.

//var abc : Int = null
// 자료형 뒤에 ?를 붙여주면 null을 가질 수 있는 타입이 된다.
var abc1 : Int? = null // "null" (X)
var abc2 : Double? = null

var g = a + 3

fun main(array: Array<String>){
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(abc1)
    println(g)
}