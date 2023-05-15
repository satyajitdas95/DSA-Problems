class Solution {
    fun removeElement(nums: IntArray, target: Int): Int {
        val indexMap = mutableListOf<Int>()
        var k=nums.size

        nums.forEachIndexed{index,num->

        if(num == target){
            indexMap.add(index) //3 
            k-- //7 6 
        } else if(num != target){
            if(indexMap.size>0){ 
                nums[indexMap[0]] = num
                indexMap.removeAt(0)
                indexMap.add(index)
            }
        }

        }

        return k
        
    }
}