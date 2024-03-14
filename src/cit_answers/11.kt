package cit_answers

import java.util.Scanner
import kotlin.math.pow

fun main() {
    val reader = Scanner(System.`in`)

    print("X ni kiriting - ")
    val x = reader.nextInt()

    if(x<5){
        val y = x.toDouble().pow(2) + 2*x - 19
        print("F(x) = $y")
    }else{
        val y = -1*(2*x/(-4*x+1))
        print("F(x) = $y")
    }
}