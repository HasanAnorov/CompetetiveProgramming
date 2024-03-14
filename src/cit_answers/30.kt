package cit_answers

import java.util.*

fun main() {
    val reader = Scanner(System.`in`)

    print("Matritsa o'lchamini kiriting - ")
    val n = reader.nextInt()

    val matrix = Array(n) { IntArray(n) }

    for (i in 0..<n) {
        val array = IntArray(n)
        for (j in 0..<n) {
            array[j] = reader.nextInt()
        }
        matrix[i] = array
    }

    var isUnit = true

    for (i in 0..<n) {
        if (matrix[i][i] != 1) {
            isUnit = false
            break
        }
    }

    println(isUnit)

//    for (i in 0..<n){
//        for (j in 0..<n){
//            println(matrix[i][j])
//        }
//    }
}