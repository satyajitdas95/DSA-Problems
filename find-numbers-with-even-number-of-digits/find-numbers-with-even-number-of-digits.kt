class Solution {
    fun findNumbers(nums: IntArray): Int {
        var counter=0
        nums.forEach{num->
        if((num.toString().length)%2 ==0){
         counter++
        }
    }
      return counter
  }
}