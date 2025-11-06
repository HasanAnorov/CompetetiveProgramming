package leet_code

class Solution1 {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        var firstIndex = -1
        var secondIndex = -1

        for(first in 0 until nums.size){
            for (second in first+1 until nums.size){
                if((nums[first] + nums[second]) == target){
                    firstIndex = first
                    secondIndex = second
                    break
                }
            }
            if (firstIndex != -1){
                break
            }
        }
        return intArrayOf(firstIndex, secondIndex)
    }
}