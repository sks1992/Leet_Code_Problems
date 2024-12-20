package Leet_Code_150_Interview_Questions

/*
55. Jump Game

You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.



Example 1:

Input: nums = [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: nums = [3,2,1,0,4]
Output: false
Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.


Constraints:

1 <= nums.length <= 104
0 <= nums[i] <= 105
* */

fun main() {
    val arr = intArrayOf(3, 0, 8, 2, 0, 0, 1)
    println(canJump(arr))
}

//time complexity = O(n)
//space complexity = O(1)
fun canJump(nums: IntArray): Boolean {
    var maxReach = 0 // Tracks the farthest reachable index

    for (i in nums.indices) {
        if (i > maxReach) {
            // If the current index is beyond the farthest reachable index, return false
            return false
        }
        // Update the farthest reachable index
        maxReach = maxOf(maxReach, i + nums[i])

        // If the farthest reachable index is beyond or equal to the last index, return true
        if (maxReach >= nums.lastIndex) {
            return true
        }
    }
    return false
}

