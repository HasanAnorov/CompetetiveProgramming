package cit_answers

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    print("N ni kiriting - ")
    val n = reader.nextInt()

    var factorialOfN = 1
    for (i in 1..n){
        factorialOfN *= i
    }
    println("N faktorial: $factorialOfN ga teng")

}