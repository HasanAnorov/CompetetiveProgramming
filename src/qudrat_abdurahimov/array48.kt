package qudrat_abdurahimov

fun main() {
    val array = intArrayOf(1,2,3,3,3,4,4,4,4,5,5,5,5,5,2,2,2,1,1)

    var maxItemCount = 1

    for(i in array.indices){
        var temp = 1
        for (j in array.indices){
            if(array[i] == array[j] && i!=j){
                temp++
            }
        }
        if (temp>maxItemCount){
            maxItemCount = temp
        }
    }

    print("Max item count - $maxItemCount")
}