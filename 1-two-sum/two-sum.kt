class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

   //created a map of int,int to store the deficit and the index
    val mapOfDeficit = mutableMapOf<Int, Int>()

    for (i in 0..nums.size) {
        val deficit = target - nums[i]

        //if the map have the difference then we got our pair
        if (mapOfDeficit.containsKey(nums[i])) {
            println("$nums[i] $i")
            return intArrayOf(mapOfDeficit[nums[i]]!!, i)
        }else{
            mapOfDeficit.put(deficit,i)
        }
    }

    return intArrayOf()
        
    }
}