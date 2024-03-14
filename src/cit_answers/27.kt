package cit_answers

import java.util.*

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
    for (i in 0 ..< length){
        if (array[i]<0){
            sum += array[i]
        }
    }

    println("Massivdagi manfiy sonlar yig'indisi - $sum ga teng")
}