class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        if(s.length != t.length) return false

        //creating a map of charecter with thr counbt in s
        val mapOfChar = mutableMapOf<Char,Int>()

        s.forEach{char->
            if(mapOfChar.containsKey(char)){
                var occurance : Int = mapOfChar.get(char)!!
                mapOfChar.put(char,++occurance)
            }   
            else {
                mapOfChar.put(char,1)
            }
        }

        t.forEach{char->
        if(mapOfChar.containsKey(char)){
          var occurance : Int = mapOfChar.get(char)!!
          if(occurance > 1){
              mapOfChar.put(char,--occurance)
          }else{
              mapOfChar.remove(char)
          }
        }
    }

     if(mapOfChar.size>0) return false else return true
  }
}