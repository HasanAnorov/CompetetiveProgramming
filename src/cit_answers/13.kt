package cit_answers

import java.util.*
import kotlin.math.pow

fun main() {
    val reader = Scanner(System.`in`)

    print("X ni kiriting - ")
    val x = reader.nextDouble()

    when {
        x<=0 -> {
            val y = 0
            println("F(x) = $y")
        }
        0<x && x<=1 -> {
            val y = x
            println("F(x) = $y")
        }
        x>1 -> {
            val y = x.pow(4)
            println("F(x) = $y")
        }
    }
}