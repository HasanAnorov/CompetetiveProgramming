package leet_code

import java.util.Scanner

val alphabet = charArrayOf('a','b','c','d','e','f','g','h','i','j','k','l',
    'm','n','o','p','q','r','s','t','u','v','w','x','y','z')
fun main() {

    val input = Scanner(System.`in`)
    val words = arrayOf("step","steps","stripe","stepple")
    val thisList = arrayOf(2,5,32,1,51, 7,8,2,9)
    val licencePlate = "1s3 PSt"
    val finalLicensePlate = onlyStrings(licencePlate.lowercase())
    val sortedWords = bubbleSort(words)

    for ((index, value ) in bubbleSort(words).withIndex()){
        var isCompletingWord = false
        bubbleSort(words).forEach {

        }
        finalLicensePlate.forEachIndexed { index, char ->
        }
    }

}

fun bubbleSort(words: Array<String>): Array<String> {
    for (i in words.indices) {
        for (j in words.indices) {
            if (words[i].length < words[j].length) {
                var temp = words[i]
                words[i] = words[j]
                words[j] = temp
            }
        }
    }
    return words
}

fun onlyStrings(string:String):String{
    var finalString = ""

    string.forEachIndexed { index, char ->
        alphabet.forEach {
            if (char == it){
                finalString += char
            }
        }
    }
    return finalString
}