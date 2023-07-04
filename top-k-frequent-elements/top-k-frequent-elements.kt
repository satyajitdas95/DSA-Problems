class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        
        //first we will create an map to store elemtns and count
        val counterMap = mutableMapOf<Int,Int>()    

        //get counts of number
        for(num in nums){
            counterMap[num] = counterMap.getOrDefault(num,0)+1
        }

        //sort the map by value in descending so that largest will be on top
        val sortedList = counterMap.entries.sortedByDescending{it.value}

        //run a loop till k to get keys
        var resultList = IntArray(k)
        for(index in 0 until k){
            resultList[index] = sortedList[index].key
        }

        //retunr the list
        return resultList

    }
}