package cit_answers

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    print("Sonni kiriting - ")
    val number = reader.nextInt()

    var sum = 0
    var r: Int
    var temp = number

    while (temp>0){
        r = temp%10
        sum = sum*10 + r
        temp /= 10
    }

    if (sum == number) print("$number - palindrom son")
    else print("$number - palindrome son emas")

}