package com.example.hello

fun main() {
    // 4장 34페이지
    val numbers = mutableListOf("one", "two", "three", "four")

    val modifiedFirstItem = numbers.first().let {firstItem ->
        println("리스트의 첫번째 아이템: '$firstItem'")
        if (firstItem.length >= 5) firstItem else "!" + firstItem + "!"
    }.uppercase()

    println("수정 후의 첫번째 아이템: '$modifiedFirstItem'")

    /*val firstAndLast = with(numbers, {
        "The first element is ${first()}, " +
                "the last element is ${last()}"
    })

    with(numbers) {
        println()
    }*/
}

