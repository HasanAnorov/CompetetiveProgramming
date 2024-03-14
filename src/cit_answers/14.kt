package cit_answers

import java.util.Scanner
import kotlin.math.pow

fun main() {
    val reader = Scanner(System.`in`)

    print("X ni kiriting - ")
    val x = reader.nextDouble()

    if (x in 0.0..1.0){
        val y = (x.pow(2) - x)
        print("F(x) = $y")
    }else{
        val y = 1/(x.pow(2) + 4*x)
        print("F(x) = $y")
    }
}