package com.example.hello

import javafx.geometry.Pos
import javafx.scene.Parent

class User(userId:String) {
    val userId = userId
    init {
        println("User created, $userId")
    }
}

// 3장 6페이지 - 인자를 받지않는 생성자를 가진 Test 클래스 선언 및 객체 생성
class Test() {
    init {
        println("Test 클래스 생성 완료")
    }
}
// 클래스 선언 시 내용물이 없을 경우 아래처럼 중괄호도 생략 가능
// class Test()


// 3장 8페이지 - 정수 x,y를 인자로 가지는 클래스 정의 후 매개변수 x,y를 초기화
class Position(x:Int, y:Int) {
    val propertyX = x
    val propertyY = y

    init {
        println("propertyX = $propertyX | propertyY = $propertyY")
    }
}


// 3장 10페이지 - 위 코드에서 클래스 정의와 변수 초기화를 동시에 해보자
class improvedPosition(val x: Int, val y: Int) {
    init {
        println("impPosX = $x | impPosY = $y")
    }
}


// 기본값이 있는 보조생성자 추가
class Question(val type:Int, val question:String, val answer:String) {
    constructor(question: String, answer: String):this(0, question, answer)
}


// 기본값이 있는 보조생성자 추가
class SearchRequest(
    val keyword:String,
    val sort: Int = 1,
    val resultCount: Int = 20,
    val pageNum: Int = 1,) {

    init {
        println("새로운 SearchRequest 클래스 생성!")
        println("keyword: $keyword | sort: $sort | resultCount: $resultCount | pageNum: $pageNum")
    }
}


// 3장 18페이지 - 기존 Position 클래스를 상속 가능하게 변경, 상속받은 TPosition 클래스 생성
open class PositionForInheritance(x:Int, y:Int) {
    val propertyX = x
    val propertyY = y

    init {
        println("[PositionForInheritance Class] propertyX = $propertyX | propertyY = $propertyY")
    }
}

class TPosition(x:Int, y:Int, val z:Int):PositionForInheritance(x, y)


// shape 클래스와 상속받은 Rectangle, Triangle 클래스 만들어보기
open class Shape(val type: Int, val name: String)
class Rectangle:Shape(4, "rectangle")
class Triangle:Shape(3, "triangle")


// 3장 21페이지 -
open class PositionForOverride(val x:Int, val y:Int) {
    constructor(value:Int):this(value, value)
    open fun printValue() {
        println("($x, $y)")
    }
}

class TPositionForOverride(x:Int, y:Int, val z:Int):PositionForOverride(x, y) {
    override fun printValue() {
        println("($x, $y, $z)")
    }
}



fun main() {
    val user = User("123")
    if (user is User) println("user is User type")

    println("\n----------------------\n")

    val test = Test()

    println("\n----------------------\n")

    val p1 = Position(1, 2)
    val p2 = Position(5, 5)

    println("\n----------------------\n")

    val ip1 = improvedPosition(5, 2)
    val ip2 = improvedPosition(12, 24)

    println("\n----------------------\n")

    val sr1 = SearchRequest("코틀린")

    println("\n----------------------\n")

    val pfi = PositionForInheritance(10, 10)
    val tp = TPosition(10, 10, 20)

    println("\n----------------------\n")

    val pfo = PositionForOverride(1, 2)
    pfo.printValue()
    val tpfo = TPositionForOverride(1, 2, 3)
    tpfo.printValue()


}