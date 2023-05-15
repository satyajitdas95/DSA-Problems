class Solution {
    fun removeElement(nums: IntArray, target: Int): Int {
       var k =0
       nums.forEach{num->
       if(num != target) {
           nums[k++] = num
       }
    }

    return k
  }
}