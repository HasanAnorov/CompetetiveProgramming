package leet_code

import java.util.*

class Solution125 {
    fun isPalindrome(s: String): Boolean {
        var pureString = ""
        s.lowercase(Locale.getDefault()).forEach {
            if (it.isLetter())
                pureString += it
        }
        return pureString.equals(pureString.reversed(),false)
    }
}

fun main() {
    val string = ""

    val isPalindrome = Solution125()
    val boolean :Boolean = isPalindrome.isPalindrome(string)
    println(boolean)
}