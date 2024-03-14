package leet_code

import java.util.*


val alphabet806 = charArrayOf('a','b','c','d','e','f','g','h','i','j','k','l',
    'm','n','o','p','q','r','s','t','u','v','w','x','y','z')

fun main() {

    val sc = Scanner(System.`in`)

    val widths = arrayOf(10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10)
    val s = "abcdefghijklmnopqrstuvwxyz"

    var lineCount = 0
    var lastLineWidth = 0

    var globalSum = 0
    lastLineWidth = 0
        s.forEachIndexed { index, char ->
            globalSum+=returnPixels(char,widths)
            lastLineWidth += returnPixels(char,widths)
            if (lastLineWidth>100){
                lastLineWidth -= 100
            }
        }

    lineCount = globalSum/100 + 1
    //lastLineWidth = globalSum
    println(lastLineWidth)

//    for (i in 0 until  lineCount){
//        var sum = 0
//        while (sum<100){
//            s.forEach {  char ->
//                sum+=returnPixels(char,widths)
//            }
//        }
//        lastLineWidth -= sum
//    }
//
//    println(lineCount)

}

fun returnPixels(char: Char,width:Array<Int>) :Int{
    var returningIndex = 0
    for ((index, value ) in alphabet.withIndex()){
        if (char == value){
            returningIndex = width[index]
        }
    }
    return returningIndex
}



