package qudrat_abdurahimov

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    print("Enter N - ")
    val n = reader.nextInt()

    print("Enter K - ")
    val k = reader.nextInt()

    val array = intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15)

    for (i in k..<array.size step k){
        print(array[i])
    }

}