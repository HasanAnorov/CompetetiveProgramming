package cit_answers

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    print("N sonini kiriting - ")
    val number = reader.nextInt()

    var temp = number
    var sum = 0

    while (temp>0){
        sum += temp % 10
        temp/=10
    }

    println("$number ning raqamlar yig'indisi - $sum ga teng ")
}