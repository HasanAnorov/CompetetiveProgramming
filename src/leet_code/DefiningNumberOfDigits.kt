package leet_code

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    print("Enter number - ")
    val number: Long = sc.nextLong()

    var tempNumber: Long = number
    var numberOfDigits = 1
    while (tempNumber/10>0){
        numberOfDigits += 1
        tempNumber /= 10
    }
    println("Number of digits - $numberOfDigits")
}