package cit_answers

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    print("Massiv o'lchamini kiriting - ")
    val arrayLength = reader.nextInt()

    val array = IntArray(arrayLength)
    for (i in 0..<arrayLength){
        print("Massivning ${i+1} elementini kiriting - ")
        array[i] = reader.nextInt()
    }

    val evenAndOddArray = IntArray(arrayLength)
    var index = 0

    for (i in 0..<arrayLength){
        if(array[i]%2 == 0){
            evenAndOddArray[index] = array[i]
            index++
        }
    }
    for (i in 0 ..<arrayLength){
        if (array[i]%2 == 1){
            evenAndOddArray[index] = array[i]
            index++
        }
    }

    println("Tartiblangan masssiv :")
    for (i in 0..<arrayLength){
        println("Massive ${i+1} elementi - ${evenAndOddArray[i]}")
    }
}