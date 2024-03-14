package qudrat_abdurahimov

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    print("Enter N - ")
    val n = reader.nextInt()

    val array = IntArray(n)
    for (i in array.indices){
        print("Enter element${i+1} - ")
        array[i] = reader.nextInt()
    }

    var counter = 0

    for (i in 0 ..<array.size-1){
        if(array[i]>array[i+1]){
            counter++
        }
    }

    print("Count of number that are higher than their right side is - $counter")

}