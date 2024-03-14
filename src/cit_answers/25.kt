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

    for (i in 0 ..< length){
//        println("first - $i")
        for (j in 1+i ..< length){
//            println("second - $j")
            //change < to > to reorder elements in ascending order
            if (array[i]<array[j]){
                val temp = array[i]
//                println("done - $temp - ${array[j]}")
                array[i] = array[j]
                array[j] = temp
            }
        }
    }

    for (i in 0 ..<length){
        println(array[i])
    }

}