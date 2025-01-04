package leet_code

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    print("Enter roman number - ")
    val romanNumber = reader.nextLine()

    println("Integer is - ${romanToInt(romanNumber)}")

}

fun romanToInt(x: String): Int {
    val romanNumbersIntForms = mapOf(
        "M" to 1000,
        "CM" to 900,
        "D" to 500,
        "CD" to 400,
        "C" to 100,
        "XC" to 90,
        "L" to 50,
        "XL" to 40,
        "X" to 10,
        "IX" to 9,
        "V" to 5,
        "IV" to 4,
        "I" to 1,
    )

    var output = 0
    var romanNumber = x

    romanNumbersIntForms.keys.forEachIndexed outer@ { _, key ->
        if (romanNumber.contains(key) && romanNumber.startsWith(key)) {
            var keyCountInRomanNumber = 1
            romanNumber.forEachIndexed inner@ { index, romanNumberChar ->
                if (romanNumberChar == key[0] && index<romanNumber.length-1 && romanNumberChar == romanNumber[index+1]) {
                    keyCountInRomanNumber++
                }else{
                    return@inner
                }
            }
            output += if (keyCountInRomanNumber == 0) {
                romanNumbersIntForms[key]!!
            } else {
                keyCountInRomanNumber * romanNumbersIntForms[key]!!
            }
            repeat(keyCountInRomanNumber){
                romanNumber = romanNumber.replaceFirst(key, "")
            }
        }
    }
    return output
}