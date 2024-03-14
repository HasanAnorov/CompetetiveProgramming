package cit_answers

import java.util.Scanner
import kotlin.math.sqrt

fun main() {
    val reader = Scanner(System.`in`)

    print("N ni kiriting - ")
    var isTub = true
    val number = reader.nextInt()

    val sqrtNumber = sqrt(number.toDouble()).toInt()
    for (i in 2 ..sqrtNumber){
        if(number%i == 0){
            isTub = false
            break
        }
    }
    if (isTub) print("N soni tub") else print("N soni tub emas")
}