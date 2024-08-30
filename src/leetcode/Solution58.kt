package leetcode

fun lengthOfLastWord(s: String): Int {
    val n = s.length -1
    var count = 0
    for (i in n downTo 0 ) {
        if ( s[i] != ' ') count ++
        if ( s[i] == ' ' && count > 0) break
    }
    return count
}

fun main() {
    println("${lengthOfLastWord("Hello World")}")
    println("${lengthOfLastWord("   fly me   to   the moon  ")}")
    println("${lengthOfLastWord("luffy is still joyboy")}")
}