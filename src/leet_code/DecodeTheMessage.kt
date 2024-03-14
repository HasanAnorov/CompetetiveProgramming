package leet_code

val question_number = 2325

class Solution {
    fun decodeMessage(key: String, message: String): String {
        val trimKey = key.filter {
            !it.isWhitespace()
        }
        val nonDuplicated = mutableSetOf<Char>()
        trimKey.forEach {
            nonDuplicated.add(it)
        }

        val alphabet = ('a'..'z').joinToString("")
        val messageCharIndexes  = mutableListOf<Int>()
        for (messageChar in message){
            for((index,value ) in nonDuplicated.withIndex()){
                if (messageChar==value){
                    messageCharIndexes.add(index)
                    break
                }
            }
        }
        var output = ""
        for (value in messageCharIndexes){
            alphabet.forEachIndexed{indexAlphabet: Int, charAlphabet: Char ->
                if (value==indexAlphabet){
                    output+=charAlphabet
                }
            }
        }
        println(output)
        return "out"
    }
}

fun main() {
    val key = "the quick brown fox jumps over the lazy dog"
    val message = "vkbs bs t suepuv"

    val solution = Solution()
    println( solution.decodeMessage(key,message) )
}