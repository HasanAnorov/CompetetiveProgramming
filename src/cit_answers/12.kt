package cit_answers

import java.util.*
import kotlin.math.pow

fun main() {
    val reader = Scanner(System.`in`)

    print("X ni kiriting - ")
    val x = reader.nextInt()

    if(x>3){
        val y = 2*x.toDouble().pow(2) - 3*x - 9
        print("F(x) = $y")
    }else{
        val y = 12/(2*x.toDouble().pow(2)+1)
        print("F(x) = $y")
    }
}