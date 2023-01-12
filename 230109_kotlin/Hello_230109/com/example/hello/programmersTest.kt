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
    var my_string:String = "BCBdbe"
    var letter:String = "B"
    var answer:String = ""

    for (i in my_string.indices) {
        if (my_string[i] != letter[0]) {
            answer += my_string[i].toString()
        }
    }

    println(answer)
}