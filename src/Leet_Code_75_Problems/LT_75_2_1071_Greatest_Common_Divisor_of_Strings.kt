package Leet_Code_75_Problems

/*
*1071. Greatest Common Divisor of Strings
Easy
For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t
* (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""


Constraints:

1 <= str1.length, str2.length <= 1000
str1 and str2 consist of English uppercase letters.
*
* */
fun main() {
    val S1 = "ABCABC"
    val S2 = "Ab"
    println(gcdOfStrings(S1, S2))
}

//time complexity =O(m+n)
//space complexity =O(1)
fun gcdOfStrings(str1: String, str2: String): String {
    if ((str1 + str2) == (str2 + str1)) {  // O(m+m)
        val l1 = str1.length
        val l2 = str2.length
        val gcd = _gcd(l1, l2)
        return str1.substring(0, gcd)
    } else {
        return ""
    }
}

private fun _gcd(a: Int, b: Int): Int { //nlogm
    var tempA = a
    var tempB = b
    while (tempB % tempA != 0) {
        val r = tempB % tempA
        tempB = tempA
        tempA = r
    }
    return tempA
}

/*
class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
        if ((str1 + str2) == (str2 + str1)) {
            val a = str1.length
            val b = str2.length
            val gcd = _gcd(a, b)
            return str1.substring(0, gcd)
        } else {
            return ""
        }
    }

    private fun _gcd(a: Int, b: Int): Int {
        var tempA = a
        var tempB = b
        while (tempB % tempA != 0) {
            val r = tempB % tempA
            tempB = tempA
            tempA = r
        }
        return tempA
    }
}
* */
