package leet_code

import kotlin.math.abs

class Solution2 {
    fun reverse(x: Int): Int {
        val number = abs(x)
        val returnNumber = number.toString().reversed().toInt()
        if (x>0)
        return returnNumber
        else return (-1*returnNumber)
    }
}

fun main() {
    val solution = Solution2()
    println( solution.reverse(1534236469))
}