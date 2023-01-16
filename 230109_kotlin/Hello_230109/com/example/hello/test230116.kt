package com.example.hello

// 4장 3페이지
fun message(name:String, message:String="Hello", year:Int):String{
    return "It's ${year}. ${message}, ${name}"
}


// 4장 4페이지
open class A{
    open fun foo(i:Int = 10) {
        println(i)
    }
}

class B: A(){
    override fun foo(i: Int) {
        println(i)
    }
}

fun foo(bar:Int = 0, baz:Int) {
    println("$bar, $baz")
}

fun bar(foo:Int, baz:Int = 0) {
    println("$foo, $baz")
}


// 사칙연산 함수
fun add(n1:Int, n2:Int) = n1 + n2
fun sub(n1:Int, n2:Int) = n1 - n2
fun mul(n1:Int, n2:Int) = n1 * n2
fun div(n1:Int, n2:Int) = if(n2==0) 0 else n1 / n2


// 4장 6페이지
fun foo1(vararg items:Int) {
    for (i in items)
        print(i)
    println()
}

fun foo2(vararg strings:String) {
    strings.forEach { println(it) }
}


// 4장 14슬라이드
fun getBody(type:Int=0):()->Unit {
    if(type==0) {
        return fun(){
            println("Hello")
        }
    }
    else {
        return fun() {
            println("Everyone")
        }
    }
}

fun foo3(i:Int, f:(Int)->Int):Int{
    return f(i)
}

fun bar3(i:Int): Int {
    return i*-1
}

fun main() {
    print{ message(year = 2022, name = "user") }

    println("\n------------------\n")

    val a = A()
    a.foo()
    val b = B()
    b.foo()

    foo(baz=1)
    bar(1)
    bar(1, 2)

    println("\n------------------\n")

    val ops = arrayOf(::add, ::sub, ::mul, ::div, {n1, n2 -> n1 % n2}, fun (n1:Int, n2:Int):Int {return n1 * n2 * n2})
    ops.forEach { println(it(5, 2)) }

    println("\n------------------\n")

    foo1()
    foo1(1, 2, 3)
    foo1(1, 2, 3, 4, 5)

    println("\n------------------\n")

    var arr = arrayOf("1", "2", "3")
    //foo(arr) -> Err
    foo2(*arr)

    println("\n------------------\n")

    var f = getBody(0)
    f()
    f = getBody(1)
    f()

    println("\n------------------\n")

    val myFun = ::bar3              // type 추론
    val myFun2:(Int)->Int = ::bar3  // type 지정
    println(myFun(1))
    println(myFun2(2))

    println(foo3(3, fun(i:Int):Int {return i*-1}))  // 익명 함수 파라미터
    println(foo3(4, ::bar3))
}


