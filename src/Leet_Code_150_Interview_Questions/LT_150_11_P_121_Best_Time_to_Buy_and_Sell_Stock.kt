package Leet_Code_150_Interview_Questions

import kotlin.math.max

/**
121. Best Time to Buy and Sell Stock
Easy

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and
choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.


Constraints:

1 <= prices.length <= 105
0 <= prices[i] <= 10^4
 * */

fun main() {
    //val prices = intArrayOf(7, 1, 5, 3, 6, 4)
    val prices = intArrayOf(7, 6, 4, 3, 1, 9)
    println(maxProfit1(prices))
}

//time complexity = O(n^2)
//space complexity = O(1)
fun maxProfit(prices: IntArray): Int {
    var profit = 0
    for (i in prices.indices) {
        if (i == prices.size - 1) {
            break
        }
        for (e in i + 1..<prices.size) {
            val diff = prices[e] - prices[i]
            if (profit < diff) {
                profit = diff
            }
        }
    }
    return if (profit <= 0) 0 else profit
}

//time complexity = O(n)
//space complexity = O(1)
fun maxProfit1(prices: IntArray): Int {
    var buy = prices[0]
    var profit = 0

    for (e in 1..<prices.size) {
        //mean we are going in loss
        if (buy > prices[e]) {
            buy = prices[e]
        } else {
            //we are in profit
            profit = max(profit, prices[e] - buy)
        }
    }
    return profit
}

