package qudrat_abdurahimov

fun main() {
    val array = intArrayOf(1,2,3,3,3,4,4,4,4,5,5,5,3,5,2,2,2,1,1)

    var localMax = 0
    for (i in 0 ..<array.size-2){
        if(array[i+1]<array[i] && array[i+1]<array[i+2] && array[i+1]>localMax){
            localMax = array[i+1]
        }
    }

    print("Local max is - $localMax")
}