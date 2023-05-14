class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var uniqIndex= 1
        for(i in nums.indices){ 
            if(i>0 && nums[i] != nums[i-1]){
                nums[uniqIndex] = nums[i]
                uniqIndex = ++uniqIndex        
            }
        } 
  
        return uniqIndex
    }
}