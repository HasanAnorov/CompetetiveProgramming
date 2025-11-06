package grokking_algorithms

fun main() {

    //val array = intArrayOf(2, 3, 4, 5)
    //val sumOfArray = sumArray(array = array)
    //print("Sum of array is - $sumOfArray")

    //val list = listOf(1,2,3,4,5,6,7,8)
    //val numberOfList = countItemsInList(list)
    //print("Number of items in the list is $numberOfList")


    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
//    val maxNumber = findMax(list)
//    print("The maximum number is $maxNumber")

    val index = selectionSortWithRecursion(list, 3)
    print(index)

}

// Exercises
// 4.1 - Recursive kotlin function that calculates sum of int type array
fun sumArray(array: IntArray, startIndex: Int = 0): Int {
    return if (array.size == startIndex + 1) {
        array[startIndex]
    } else {
        array[startIndex] + sumArray(array, startIndex + 1)
    }
}

// 4.2 - Recursive kotlin function that counts the number if items in the list
fun countItemsInList(list: List<Int>, startIndex: Int = 0): Int {
    return if (list.lastIndex == startIndex) {
        1
    } else {
        1 + countItemsInList(list, startIndex + 1)
    }
}

// 4.3 - Recursive kotlin function that finds the maximum number in a list
fun findMax(list: List<Int>): Int {
    // Base case: if only one element, that's the maximum
    if (list.size == 1) return list[0]

    // Recursive case: find the max of the rest of the list
    val subMax = findMax(list.drop(1))

    // Compare the first element with the max of the rest
    return if (list[0] > subMax) list[0] else subMax
}

// 4.4 - Recursive implementation of binary search
fun selectionSortWithRecursion(list: List<Int>, item: Int): Int? {
    val lowIndex = 0
    val maxIndex = list.size - 1

    val midIndex = (lowIndex + maxIndex) / 2
    val midItem = list[midIndex]

    if (midItem == item) return midIndex

    val subMidIndex = if (midItem < item) {
        selectionSortWithRecursion(list.drop(midIndex + 1), item)
    } else {
        selectionSortWithRecursion(list.dropLast(midIndex + 2), item)
    }

    return subMidIndex
}



