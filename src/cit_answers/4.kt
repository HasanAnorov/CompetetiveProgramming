package cit_answers

import java.util.*
import kotlin.math.pow

fun main() {
    val reader = Scanner(System.`in`)

//    print("a1 ni kiriting - ")
//    val a1 = reader.nextInt()
//    print("d ni kiriting - ")
//    val d = reader.nextInt()
//    print("n ni kiriting - ")
//    val nA = reader.nextInt()
//
//    val sumArithmetic = (2*a1 + (nA-1)*d)*nA/2
//    print("Arifmetik progressiyaning yig'indisi - $sumArithmetic")


    print("b1 ni kiriting - ")
    val b1 = reader.nextInt()
    print("q ni kiriting - ")
    val q = reader.nextInt()
    print("n ni kiriting - ")
    val nB = reader.nextInt()

    val sumGeometric = (b1*(1- q.toDouble().pow(nB.toDouble())))/(1-q)
    println("Geometrik progressiyaning yig'indisi - $sumGeometric")

}