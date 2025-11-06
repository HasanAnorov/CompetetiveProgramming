package grokking_algorithms

fun main() {
    val array = intArrayOf(5,3,6,2,10)

    selectionSort(array = array).forEach {
        println(it)
    }
}

fun findSmallest(list: List<Int>): Int {
    var smallest = list[0]
    var smalledIndex = 0

    for (index in 0 until list.size) {
        if (list[index] < smallest) {
            smallest = list[0]
            smalledIndex = index
        }
    }
    return smalledIndex
}

fun selectionSort(array: IntArray) : IntArray{
    val newArray = IntArray(size = array.size)
    val copiedArray = array.toMutableList()

    for (index in 0 until  array.size){
        val smallestIndex = findSmallest(list = copiedArray)
        newArray[index] = copiedArray[smallestIndex]
        copiedArray.removeAt(smallestIndex)
    }
    return newArray
}
