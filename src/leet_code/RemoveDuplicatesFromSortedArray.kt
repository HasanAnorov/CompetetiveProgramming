package leet_code

fun main() {
    val numbers = intArrayOf(1,1,1,1,2, 3, 4, 5, 5, 6)

    println(
        "sorted array size - ${removeDuplicates(numbers)}"
    )
}

fun removeDuplicates(nums: IntArray): Int {
    var count = 1
    for(i in 1..<nums.size){
        if(nums[i] != nums[i-1]){
            nums[count] = nums[i]
            count++
        }
    }
    return count
}