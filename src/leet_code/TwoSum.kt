package leet_code

class Solution1 {

    var firstIndex = -1
    var secondIndex = -1

    fun twoSum(nums: IntArray, target: Int): IntArray {
        for((index, value ) in nums.withIndex()){
            for ((indexInner, valueInner) in nums.withIndex()){
                if(index!=indexInner&&(valueInner + value) == target){
                    firstIndex = index
                    secondIndex = indexInner
                    break
                }
            }
            if (firstIndex!=-1||secondIndex!=-1)
                break
        }
        return intArrayOf(firstIndex,secondIndex)
    }
}