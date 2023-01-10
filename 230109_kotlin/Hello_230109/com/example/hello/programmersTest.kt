package com.example.hello

// 프로그래머스 등 알고리즘 테스트용 파일

fun main() {
    var myString: String = "aAb1B2cC34oOp"

    var result: Int = 0

    for (i in myString.indices) {
        val j: Char = myString.substring(i, i + 1).first()
        if (j.toInt() >= 48 && j.toInt() <= 55)
            result += j.toInt() - 48
    }
    println(result)
}