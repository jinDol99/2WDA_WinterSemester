package com.example.hello

import com.example.hello.publicTest



fun main() {
    arrayTypePrint()

    println("\n-------------------\n")

    gugudan()

    println("\n-------------------\n")

    intArrayPrint()

    println("\n-------------------\n")

    publicTest()

    println("\n-------------------\n")
}

// 2장 15페이지 - 배열의 항목에 대해 타입을 출력
fun arrayTypePrint() {
    val array = arrayOf(1, 2, 3, "a", "b", "c", true, false)
    array.forEach {
        val str = when(it) {
            is String -> "String"
            is Number -> "Number"
            else -> "Else"
        }
        println("$it - $str")
    }
}

// 2장 19페이지 - 랜덤 구구단 출력
fun gugudan() {
    val randomNum = (2..9).random()
    for (i in 1..9) {
        println("$i * $randomNum = " + (randomNum * i))
    }
}

// 2장 21페이지 - 배열 내용 순서대로 출력
fun intArrayPrint() {
    val myIntArray = intArrayOf(10, 20, 30, 40, 50)
    
    for ((index, value) in myIntArray.withIndex()) {
        println("인덱스: $index | 값: $value")
    }

    /* 이 뿐만 아니라 아래와 같은 여러 방법들도 사용 가능
    for (i in 0 until myIntArray.size)
        println("인덱스: $i | 값: ${myIntArray[i]}")

    for (i in 0..array.lastIndex)
        println("인덱스: $i | 값: ${myIntArray[i]}")

    for (i in array.indices)
        println("인덱스: $i | 값: ${myIntArray[i]}")
    */
}

// 230110 16:43 - 프로그래머스 알고리즘 문제 푼 내용은 노션에 정리 완료!



