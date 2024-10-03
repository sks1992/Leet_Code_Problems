package Leet_Code_150_Interview_Questions

/*
*
* 28. Find the Index of the First Occurrence in a String
Easy
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
* or -1 if needle is not part of haystack.



Example 1:

Input: haystack = "sadbutsad", needle = "sad"
Output: 0
Explanation: "sad" occurs at index 0 and 6.
The first occurrence is at index 0, so we return 0.
Example 2:

Input: haystack = "leetcode", needle = "leeto"
Output: -1
Explanation: "leeto" did not occur in "leetcode", so we return -1.


Constraints:

1 <= haystack.length, needle.length <= 104
haystack and needle consist of only lowercase English characters.
*
* */

fun main() {
    println(findTheIndexOfTheFirstOccurrenceInAString("leetcode", "leeto"))
    println(findTheIndexOfTheFirstOccurrenceInAString("sadbutsad", "sad"))
    println(findTheIndexOfTheFirstOccurrenceInAString("hello", "ll"))
}

fun findTheIndexOfTheFirstOccurrenceInAString(haystack: String, needle: String): Int {
    //If needle is empty, the index to return is 0 (as per the problem statement).
    if (needle.isEmpty()) return -1
    // Get the lengths of haystack and needle.
    val hL = haystack.length
    val nL = needle.length
    // Initialize pointers for haystack and needle.
    var haystackPointer = 0
    var needlePointer = 0

    while (haystackPointer < hL) {
        // Check if the current characters in the haystack and needle are the same.
        if (haystack[haystackPointer] == needle[needlePointer]) {
            // Special case: if needle length is 1 and characters match,
            // we found the needle.
            if (nL == 1) return haystackPointer
            haystackPointer++
            needlePointer++
        } else {
            // Current characters do not match. Reset haystackPointer back by the amount
            // needlePointer had advanced, then move forward by one to search from next position.
            haystackPointer -= needlePointer - 1;
            // Reset needlePointer back to the start of the needle.
            needlePointer = 0
        }
        // Check if the needle has been found within the haystack.
        if (needlePointer == nL) {
            // The start of the substring in haystack that matches the needle
            // is at the difference between current haystackPointer and the length of the needle.
            return haystackPointer - needlePointer
        }
    }
    // Needle was not found in the haystack. Return -1 as specified in the
    // problem statement.
    return -1
}



