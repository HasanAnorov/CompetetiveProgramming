package leet_code

import kotlin.math.pow

fun main() {
    val firstNode = listOf(9,9,9,9,9,9,9)
    val secondNode = listOf(9,9,9,9)
    print("result  - ${addTwoNumbers(firstNode, secondNode)}")
}

fun addTwoNumbers(l1: List<Int>, l2: List<Int>): List<Int> {
    val firsNumber = listToNumber(l1)
    val secondNumber = listToNumber(l2)

    return intNumbersToListReversely(firsNumber+secondNumber)
}

fun intNumbersToListReversely(number: Int): List<Int>{
    //to remove unnecessary iteration
    if (number<10) return listOf(number)

    val newList = mutableListOf<Int>()
    var tempNumber = number
    do {
        newList.add(tempNumber%10)
        tempNumber /= 10
    }while (tempNumber>0)
    return newList
}

fun listToNumber(list: List<Int>): Int {
    var firstNumber = 0.0
    for (i in 0 until list.size){
        firstNumber += list[i]* 10.0.pow(i.toDouble())
    }
    return firstNumber.toInt()
}