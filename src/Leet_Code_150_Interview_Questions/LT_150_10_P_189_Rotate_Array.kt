package Leet_Code_150_Interview_Questions

/**
189. Rotate Array
Solved
Medium
Topics
Companies
Hint
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.



Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]


Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105


Follow up:

Try to come up with as many solutions as you can. There are at least three different ways to solve this problem.
Could you do it in-place with O(1) extra space?
 * */

fun main() {
    val muns = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    val k = 3
    rotate(muns, k)
    println(muns.contentToString())
}

//time complexity = O(n)
//space complexity =O(1)
fun rotate(nums: IntArray, k: Int): Unit {
    val m = nums.size
    if (m == 1) return
    val k1 = if (k > m) k % m else k
    reverse(nums, 0, m - 1)
    reverse(nums, 0, k1 - 1)
    reverse(nums, k1, m - 1)
}

fun reverse(nums: IntArray, start: Int, end: Int) {
    var s = start
    var e = end
    while (s <= e) {
        val temp = nums[s]
        nums[s] = nums[e]
        nums[e] = temp
        s++
        e--
    }
}
