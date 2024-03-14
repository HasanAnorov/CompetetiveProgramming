package cit_answers

import java.util.*
import kotlin.math.sqrt

fun main() {
    val reader = Scanner(System.`in`)

    print("a ni kiriting - ")
    val a = reader.nextInt()
    print("b ni kiriting - ")
    val b = reader.nextInt()
    print("c ni kiriting - ")
    val c = reader.nextInt()

    val d = (b*b).toDouble()-4*a*c
    println("D = $d")

    when{
        d>0 -> {
            println("d>0 va tenglama 2 ta yechimga ega, bular :")
            println("x1 = ${(-1*b+sqrt(d))/2*a}")
            print("x2 = ${(-1*b-sqrt(d))/2*a}")
        }
        d<0 -> {
            print("Tenglama yechimlarga ega emas")
        }
        d.toInt()==0 -> {
            print(" d=0 va tenglama 1 ta x = ${-b/2*a}")
        }
    }

}