package qudrat_abdurahimov

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    print("Enter N - ")
    val n = reader.nextInt()

    print("Enter K - ")
    val k = reader.nextInt()

    print("Enter L - ")
    val l = reader.nextInt()

    val array = IntArray(n)
    for (i in array.indices){
        array[i] = reader.nextInt()
    }

    var sum = 0
    var counter = 0

    for(i in array.indices){
        if(i in k..l) continue
        sum += array[i]
        counter++
    }

    println("O'rta arifmetik $sum $counter - " + sum.toDouble()/counter)

}