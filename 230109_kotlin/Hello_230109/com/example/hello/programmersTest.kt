package com.example.hello

// 프로그래머스 등 알고리즘 테스트용 파일

fun main() {
    // 문자열 속 숫자 더하기 문제 - https://school.programmers.co.kr/learn/courses/30/lessons/120851
    /*var myString: String = "aAb1B2cC34oOp"
    var result: Int = 0

    for (i in myString.indices) {
        val j: Char = myString.substring(i, i + 1).first()
        if (j.toInt() >= 48 && j.toInt() <= 55)
            result += j.toInt() - 48
    }
    println(result)*/

    // 특정 문자 제거 문제 - https://school.programmers.co.kr/learn/courses/30/lessons/120826
    /*var my_string:String = "BCBdbe"
    var letter:String = "B"
    var answer:String = ""

    for (i in my_string.indices) {
        if (my_string[i] != letter[0]) {
            answer += my_string[i].toString()
        }
    }

    println(answer)*/

    // 나눗셈 후 정수부분 출력 문제 - https://school.programmers.co.kr/learn/courses/30/lessons/120806
    /*val num1: Int = 3
    val num2: Int = 2

    num1.toDouble()
    num2.toDouble()

    println("num1: $num1 , num2: $num2")
    println("num1: ${num1.javaClass.name} | num2: ${num2.javaClass.name}")

    val divResult: Double = (num1.toDouble() / num2.toDouble()) * 1000

    println(divResult.toInt())*/

    val num: Int = 10
    num.toDouble()
    val revertedNum: Double = num.toDouble()

    println("$num | ${num.javaClass.name}")  // 10 (Int 형식!)
    println("$revertedNum | ${revertedNum.javaClass.name}")  // 10.0 (Double 형식!)
}