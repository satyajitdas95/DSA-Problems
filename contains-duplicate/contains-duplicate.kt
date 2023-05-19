class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val numSet = mutableSetOf<Int>()

        nums.forEach{num->

          if(numSet.contains(num)) return true
          numSet.add(num)

        }

        return false
    }
}