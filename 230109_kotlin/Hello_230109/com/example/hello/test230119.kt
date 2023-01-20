package com.example.hello

// 숫자 두개 받아서 큰거 리턴하는 함수
fun max(a:Int, b:Int):Int = if (a>b) a else b


// name, email 가지는 user 클래스. email과 name이 같다면 ture
data class User3(val id:String, val name:String, val phone: String? = null) {
}


// student 클래스 정의하고 특정 프로퍼티를 null로 디폴트값 생성. 그리고 출력
class Student(val id:String, val name:String, val phone:String? = null) {
    override fun toString(): String {
        var str = "$id, $name"
        if (phone != null) str += ",$phone"
        return str
    }
}


// String을 파라미터로 받아 문자열에 a가 몇개 있는지 반환하는 함수
fun findA(str: String):Int {
    var result:Int = 0
    for (i in str.indices) {
        if (str[i] == 'a') result++
    }
    return result
}


// 정수 두개를 받아 작은 수 반환하는 함수(표현식으로)
fun min(a:Int, b:Int):Int = if (a < b) a else b


// 두 구현 객체를 만들고 호출하기
fun interface OnSelect {
    fun process(selection:Int):Int{

    }
}

interface OnTest {
    fun onStart(mode:Int)
    fun onFinished(result:Int)
}


// 글자수를 세는 String 확장함수 정의하기
fun String.count(c:Char):Int {
    var count = 0
    for ( i in this ){
        if (i == c) count++
    }
    return count
}


fun main() {
    val u1 = User3("aaa", "bbb")
    val u2 = User3("aaa", "bbb")
    println(u1 == u2)

    println("\n------------------------\n")

    val s1 = Student("1", "A")
    val s2 = Student("1", "A", "010-1234-1234")
    println(s1)
    println(s2)

    println("\n------------------------\n")

    println(findA("abcabcabc"))

    println("\n------------------------\n")

//    val select = OnSelect { if(it > 0) 1 else -1 }
//    select.process(0)

    println("\n------------------------\n")

    val myStr:String = "abcd"
    println(myStr.count())
}

