package grokking_algorithms

/**
 * Grokking algorithms:
 *
 * Binary Search, in list of N, binary search will take log(2)N steps to run in the worst case.
 *
 *  low     -mid-     max
 *   |******************|
 *
 *   if mid > item then max = mid else low = mid
 */

fun main() {
    val intArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val item = 2

    val result = binarySearch(
        array = intArray,
        item = item
    )
    if (result == null) {
        print("Item not foud")
    } else {
        print("Item's index is $result")
    }
}

fun binarySearch(array: IntArray, item: Int): Int? {
    var lowIndex = 0
    var maxIndex = array.size - 1

    while (lowIndex <= maxIndex) {
        val midIndex = (lowIndex + maxIndex) / 2
        val midItem = array[midIndex]

        if (midItem == item) {
            return midIndex
        } else if (midItem > item) {
            maxIndex = midIndex - 1
        } else {
            lowIndex = midIndex + 1
        }
    }
    return null
}