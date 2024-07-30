class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        nums.forEachIndexed{index,num->
            if(num >= target){
                return index
            }
        }

        return nums.size
    }
}

//scna through array
// if i get the number return index
// if get bigger number return prvs index