class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        for (i in nums.indices) {
            if (nums[i] == target) {
                return i
            } else if (nums[i] < target) {
                continue
            } else if (nums[i] > target) {
                return i
            }
        }
        return nums.size
    }

}

fun main() {
    val solution = Solution()
    println(solution.searchInsert(intArrayOf(1,3,5,6),5))
    println(solution.searchInsert(intArrayOf(1,3,5,6),2))
    println(solution.searchInsert(intArrayOf(1,3,5,6),7))
}
