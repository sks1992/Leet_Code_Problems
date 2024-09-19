package Leet_Code_75_Problems

/**
 * 1768. Merge Strings Alternately
 * Easy

 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
 * starting with word1. If a string is longer than the other, append the additional letters onto the
 * end of the merged string.
 *
 * Return the merged string.
 *
 *
 *
 * Example 1:
 *
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 * Example 2:
 *
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 * Explanation: Notice that as word2 is longer, "rs" is appended to the end.
 * word1:  a   b
 * word2:    p   q   r   s
 * merged: a p b q   r   s
 * Example 3:
 *
 * Input: word1 = "abcd", word2 = "pq"
 * Output: "apbqcd"
 * Explanation: Notice that as word1 is longer, "cd" is appended to the end.
 * word1:  a   b   c   d
 * word2:    p   q
 * merged: a p b q c   d
 *
 *
 * Constraints:
 *
 * 1 <= word1.length, word2.length <= 100
 * word1 and word2 consist of lowercase English letters.
 *
 * */


fun main() {
    val word1 = "abcd"
    val word2 = "pq"
    println(mergeAlternately(word1, word2))
}

fun mergeAlternately(word1: String, word2: String): String {
    val mergeString = StringBuilder()
    var i=0
    var j=0
    //when both i and j less than word length.
    while(i< word1.length || j < word2.length){
        if(i<word1.length) mergeString.append(word1[i++])
        if(j<word2.length) mergeString.append(word2[j++])
    }
    return mergeString.toString()
}


//class Solution {
//    fun mergeAlternately(word1: String, word2: String): String {
//        val sb = StringBuilder()
//        var i = 0
//        var j = 0
//        while (i < word1.length || j < word2.length) {
//            if (i < word1.length) sb.append(word1[i++])
//            if (j < word2.length) sb.append(word2[j++])
//        }
//        return sb.toString()
//    }
//}