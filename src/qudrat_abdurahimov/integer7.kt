package qudrat_abdurahimov

import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)
    print("Enter a number - ")

    val number: Long = reader.nextLong()
    println("Number is - $number")

    var digitsCount = 1
    var tempNumberForDigitsCount = number
    while(tempNumberForDigitsCount/10>0){
        digitsCount += 1
        tempNumberForDigitsCount /= 10
    }

    val arrayOfDigits = LongArray(digitsCount)

    var tempNumberForExtractingDigits = number
    for (i in 0..<digitsCount){
        val digit = tempNumberForExtractingDigits%10
        arrayOfDigits[digitsCount-1-i] = digit
        tempNumberForExtractingDigits /= 10
    }

    for((index, value) in arrayOfDigits.withIndex()){
        println("Digit in index: $index with value - $value")
    }

    var sum: Long = 0
    for (element in arrayOfDigits){
        sum += element
    }

    println("Sum of digits = $sum")

}