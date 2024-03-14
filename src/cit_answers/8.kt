package cit_answers

fun main() {

    var counter = 0

    for (i in 100 .. 999){
        var tempSum = 0
        var temp = i
        for (j in 0..<3){
            tempSum += temp % 10
            temp /= 10
        }
        if (tempSum == 17) counter++ else continue
    }

    print("17 karrali sonlar soni - $counter")
}