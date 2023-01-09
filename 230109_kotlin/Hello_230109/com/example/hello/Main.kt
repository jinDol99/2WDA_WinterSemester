package com.example.hello

import java.util.Scanner

fun main(){
    /*
    println(sum(5, 3));
    helloWorld();

    val myTrue: Boolean = true;
    val myFalse: Boolean = false;

    println(myTrue && myFalse);
    println(myTrue || myFalse);

    println("\n----------------");

    val arrayOfInt = Array(3) { it };
    val arrayOfAny = arrayOf(1, "2", false);

    println(arrayOfInt[0]);
    println(arrayOfAny[0]);

    println("\n----------------");

    arrayFunction();

    println("\n----------------");

    inputAndSumOutput();

    println("\n----------------");

    inputAndProgressiveOutput();

    println("\n----------------");

    print(sumNumber());

    println("\n----------------");

    twoRandomprint();

    println("\n----------------");

    whenTest01();

    println("\n----------------");

    whenTest02();
    */
    println("\n----------------");

    before45min();
}

// 1장 18페이지 - Hello world! 출력 실습
fun helloWorld() {
    println("안녕");
}

// 1장 20페이지 - 정수 2개 받아 더한 결과 반환하는 함수 실습
fun sum(a:Int, b:Int):Int {
    return a+b;
    // 함수를 줄여서 표현하면 아래와 같이 사용할 수 있음.
    // fun sum(a:Int, b:Int):Int = a+b
}

// 1장 38페이지 - array 속성과 주요 함수
fun arrayFunction() {
    val array = Array(5) { it }
    array.forEach { print("$it") }
    println(array.any { it > 5 })
    println(array.find { it == 1 })
    val filtered = array.filter { it > 3 }
    filtered.forEach { println("$it") }
}

// 문제 - 두 수를 입력받아 더한 값을 출력
fun inputAndSumOutput() {
    val n1 = readln().toInt()
    val n2 = readln().toInt()
    println("${n1 + n2}");
}

fun inputAndProgressiveOutput() {
    // 입력받은 두 수를 공백을 기준으로 나눠 Int로 형변환한 후 arr 배열 형식으로 초기화
    val arr = readln().split(" ").map { it.toInt() }
    println(arr[0] + arr[1])

}

fun sumNumber():Int {
    val arr = readln().split(" ").map { it.toInt() }
    return arr[0] + arr[1]
}

// 2장 4페이지 - 두 랜덤값 중 큰 수 출력
fun twoRandomprint() {
    val num1 = (1..100).random()
    val num2 = (1..100).random()

    if (num1 > num2) {
        println(num1)
    } else {
        println(num2)
    }
}

// 2장 6페이지 - 랜덤값 생성후 원본값, 절대값 출력
fun printZeoldaeValue() {
    val num = (-100..100).random()
    val result:Int
    if (num < 0) result = num * -1 else result = num
    println("$num, $result")
}

fun whenTest01() {
    when(readln().toInt()) {
        0, 1, 2 -> print("ok")
        else -> print("ng")
    }
}

fun whenTest02() {
    val validNumbers = arrayOf(10, 20, 30)

    val result = when(readln().toInt()) {
        in validNumbers -> "valid"
        in 1..30 -> "in range"
        !in 1..30 -> "범위 아님"
        else -> "대체 뭘 입력한겨"
    }

    println(result)
}

fun before45min() {
    val sc = Scanner(System.`in`)
    var hh:Int = sc.nextInt()
    var mm:Int = sc.nextInt() -45

    if (mm < 0) {
        mm += 60;
        hh--;
    }

    if (hh < 0) {
        hh += 24;
    }

    print("$hh $mm")
    sc.close()
}