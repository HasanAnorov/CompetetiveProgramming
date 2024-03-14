package cit_answers

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    print("m ni kiriting - ")
    var a = reader.nextInt()
    print("n ni kiriting - ")
    var b = reader.nextInt()

    var m =a
    var n =b

    while (m != n){
        if(m>n) m%=n
        else n%=m

        if(m == 0) m=n
        if(n == 0) n=m
    }

    println("EKUB - $m")
    println("EKUK - ${a*(b/m)}")

}