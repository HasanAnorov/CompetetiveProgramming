package qudrat_abdurahimov

fun main() {
    val arr = intArrayOf(1,2,1,67,45,2,33,12,32,555,123,5,0,4,655)
    val n = arr.size

    for (i in 0..<n - 1) {
        for (j in 0..<n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                // Swap the elements
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
    arr.forEach {
        print("$it-")
    }
}

