class Solution {
    fun plusOne(digits: IntArray): IntArray {
        val resultList = mutableListOf<Int>()
        var counterValue= 1
        var isIncreased = false

        for(i in (digits.size - 1) downTo 0){
            val number = digits[i]

            if(number < 9){
                resultList.add(0,number + counterValue)
                counterValue=0
                isIncreased = true
            } else if(!isIncreased) {
              resultList.add(0,0)
              counterValue = 1
            }else{
                resultList.add(0,number)
            }
        }

        if(counterValue==1){
            resultList.add(0,counterValue)
        }

        return resultList.toIntArray()

    }
}