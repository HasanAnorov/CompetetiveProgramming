package leet_code

class LongestCommonPrefix {

    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        var prefix = strs[0]
        for (i in 1..<strs.size) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length - 1)
                if (prefix.isEmpty()) return ""
            }
        }
        return prefix
    }

}


fun main() {
    val test = LongestCommonPrefix()
    test.longestCommonPrefix(arrayOf("sadas", "asdsadsa", "sadsfasdfsdf"))
}