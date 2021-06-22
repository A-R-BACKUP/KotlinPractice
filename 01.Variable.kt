package com.example.myapplication.Kotiln

// 01. variable  -> 변수
// -> 상자
//      -> 내 마음대로 넣을 수 있는 상자 -> variable
//      -> 한번 넣으면 바꿀 수 없는 상자 -> Value

// 변수 선언하는 방법
// var/val 변수명(상자) = 값(넣고 싶은 것)
// Variable / Value

var num = 10
var hello = "hello"
var point = 3.4

val fix = 20

fun main(args:Array<String>){

    println(num)
    println(hello)
    println(point)
    println(fix)

    num = 100
    hello = "Good Bye"
    point = 10.4

    println(num)
    println(hello)
    println(point)
    println(fix)

    //fix = 500 을 할 경우
    // Val cannot be ressigned = val은 재설정 할 수 없다...


}