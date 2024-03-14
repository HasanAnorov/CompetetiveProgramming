package qudrat_abdurahimov

import java.util.Scanner

fun main() {
    val reader = Scanner(System.`in`)

    print("Enter N - ")
    val n = reader.nextInt()

    val array = IntArray(n)

    for (i in 0 ..<n){
        print("Enter element${i+1} - ")
        array[i] = reader.nextInt()
    }

    var targetIndex = 0
    val firstElement = array.first()
    val lastElement = array.last()

//    for (i in 1..<array.size-1){
//        if(array[i]>firstElement && array[i]<lastElement){
//            targetIndex = i
//        }
//    }

    for (i in 1..<array.size-1){
        if(array[i] in (firstElement + 1)..<lastElement){
            targetIndex = i
        }
    }

    print("Target index - $targetIndex")

}