package qudrat_abdurahimov

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    print("Enter N -")
    val n = reader.nextInt()

    val array = IntArray(n)

    for (i in 0..<n){
        print("Enter ${i+1}-element : ")
        array[i] = reader.nextInt()
    }

    for (i in array.size-1 downTo 0 step 2){
        println(" - " + array[i])
    }
}