package leet_code

fun main() {
    plusOne(intArrayOf(1,2,3)).forEach {
        println(it)
    }
}

fun plusOne(digits: IntArray): IntArray{
    return if(digits.last()<9){
        println("sd")
        digits.toMutableList().apply {
            digits[digits.size-1] = 1
        }.toIntArray()
    }else {
        println("sd1")
        digits
    }
}