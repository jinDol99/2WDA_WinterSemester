package com.example.hello

// 3장 47페이지 - TestImpl 클래스 구현하기
interface Test2 {
    fun message():String
    fun value():Int
}

class TestImpl : Test2 {
    override fun message():String {
        return "hello"
    }

    override fun value(): Int {
        return 10
    }
}

// ...

// 3장 60페이지 - data 클래스 작성하기
data class User(
    val name:String,
    val id:String
)
fun main() {
    val t1 = TestImpl()
    print("${t1.message()} + ${t1.value()}")

    println("\n---------------\n")

    val u1 = User("ABC", "abc")
    val u2 = User("ABC", "abc")
    println(u1 == u2)
}
