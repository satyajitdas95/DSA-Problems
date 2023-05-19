class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val numMap = mutableMapOf<Int,Int>()
        nums.forEachIndexed{index,num->
          if(numMap.containsKey(num)){
            return true
          }else{
              numMap.put(num,index)
          }

        }
        return false
    }
}