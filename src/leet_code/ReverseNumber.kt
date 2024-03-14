package leet_code

import java.util.Scanner
import kotlin.math.pow

fun main() {

    val reader = Scanner(System.`in`)

    print("Enter number - ")
    val number: Long = reader.nextLong()

    var tempNumberForDigits = number
    var numberOfDigits = 1

    while (tempNumberForDigits/10>0){
        numberOfDigits += 1
        tempNumberForDigits /= 10
    }

    val arrayOfDigits = LongArray(numberOfDigits)
    var tempNumberForExtraction = number
    for (i in 0 ..< numberOfDigits){
        arrayOfDigits[i] = tempNumberForExtraction%10
        tempNumberForExtraction /= 10
    }

    var reverseNumber: Long = 0
    for (i in 0 ..< numberOfDigits){
        reverseNumber += 10.0.pow(numberOfDigits-i-1).toLong() * arrayOfDigits[i]
    }

    print("Number is - $number. And its reverse form is - $reverseNumber")
}