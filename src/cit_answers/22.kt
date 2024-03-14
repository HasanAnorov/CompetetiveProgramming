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

    var maxElement = array[0]
    var minELement = array[0]

    var maxIndex = 0
    var minIndex = 0

    for (i in 0..<length){
        if(maxElement<array[i]){
            maxElement = array[i]
            maxIndex = i
        }
        if (minELement>array[i]){
            minELement = array[i]
            minIndex = i
        }
    }

    println("Massivning Max elementi: $maxElement va tartib raqami: $maxIndex")
    println("Massivning Min elementi: $minELement va tartib raqami: $minIndex")

}