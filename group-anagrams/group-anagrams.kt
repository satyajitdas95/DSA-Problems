class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        // first we will create a mutableMap to store uniqe key and list of all possible anagram
        val anagramGroup = mutableMapOf<String , MutableList<String>>()

        //we will run through all the words to check the anargam
        for (str in strs){

            //First  we will sort this string . so that every key we get will be same
            val sortedString = String(str.toCharArray().sortedArray())

            //if the map already have key then we add the word to list or we create the key and add
            if(anagramGroup.containsKey(sortedString)){
                anagramGroup?.get(sortedString)?.add(str)
            }else{
                anagramGroup?.put(sortedString,mutableListOf(str))
            }

        }

         //now we retrun the values as list
        return anagramGroup.values.toList()
    }
}