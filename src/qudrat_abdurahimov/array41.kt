package qudrat_abdurahimov

import kotlin.math.max

fun main() {
    val array = intArrayOf(1,2,3,3,3,4,4,4,4,5,5,5,5,5,2,2,2,1,1)

    var targetNumber1 = array[0]
    var targetNumber2 = array[1]
    var maxSum = array[0] + array[1]

    for (i in 1 ..<array.size-1){
        var tempSum = array[i] + array[i+1]
        if(tempSum>maxSum){
            maxSum = tempSum
            targetNumber1= array[i]
            targetNumber2= array[i+1]
        }
    }

    print("Max pair elements are $targetNumber1 and $targetNumber2")

}