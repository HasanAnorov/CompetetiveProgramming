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

    var counterForPositives = 0
    var counterForNegatives = 0

    for (i in 0 ..< length){
        if(array[i]>0) counterForPositives++ else if (array[i]<0) counterForNegatives++
    }

    println("Massivedagi musbat sonlar miqdori - $counterForPositives")
    print("Massivedagi manfiy sonlar miqdori - $counterForNegatives")

}