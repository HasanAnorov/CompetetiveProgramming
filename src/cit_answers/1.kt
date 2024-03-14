package cit_answers

import java.util.Scanner

fun main() {

    val reader = Scanner(System.`in`)

    print("Massiv o'lchamini kiriting - ")
    val arrayLength = reader.nextInt()

    val array = IntArray(arrayLength)

    for (i in 0..<arrayLength){
        print("Massivning ${i+1} elementini kiriting - ")
        array[i] = reader.nextInt()
    }

    var startIndex = -1
    var endIndex = -1

    for (i in 0..<arrayLength){
        if(array[i] == 0){
            startIndex = i
            break
        }
    }
    for (j in arrayLength-1 downTo 0){
        if(array[j] == 0){
            endIndex = j
            break
        }
    }

    var sum = 0

    if(startIndex >= 0 && endIndex >= 0){
        for (i in startIndex .. endIndex){
            sum += array[i]
        }
        print("Birinchi va ohirgi 0 elementlar orasidagi elemenetlar yig'indisi - $sum")
    }else{
        print("Massivda 0 elementi yo'q")
    }

}

