package cit_answers

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    print("k-chi sekund ni kiriting - ")
    val seconds = reader.nextInt()

    val hour = seconds/3600
    val minute = (seconds%3600)/60
    val second = seconds%60

    println("$hour soat, $minute minut, $second sekund")
}