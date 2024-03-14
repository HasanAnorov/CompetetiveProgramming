package cit_answers

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    print("Massiv o'lchamini kiriting - ")
    val length = reader.nextInt()

    val array = DoubleArray(length)

    for (i in 0..<length){
        print("Massivning ${i+1} elementini kiriting - ")
        array[i] = reader.nextDouble()
    }

    var sum = 0.0
    for (i in 0..<length){
        sum += array[i]
    }
    println("O'rta arifmetik qiymat: ${sum/length} ga teng")
}