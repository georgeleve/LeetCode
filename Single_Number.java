// Solution 1 - HashTable

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
     
        for(int i : nums)
            map.put(i, map.getOrDefault(i,0) + 1);
        
        for(int i : nums)
            if(map.get(i) == 1) return i;
        
        return 0 ;
    }
}




/* Solution 2 - Bit Manipulation

 If we take XOR of zero and some bit, it will return that bit
    a⊕0=a
   If we take XOR of two same bits, it will return 0
    a⊕a=0
   So we can XOR all bits together to find the unique number.
    a⊕b⊕a=(a⊕a)⊕b=0⊕b=b
*/

class Solution{
    public int singleNumber(int [] nums){
        int temp = 0;
        for(int i : nums)
            temp ^= i;
        return temp;
    }
}
