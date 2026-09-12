import java.util.*;
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int prod=0;
        for(int num:map.keySet())
        {
            if(map.get(num)==2)
            {
                prod^=num;
            }
        }
        return prod;
    }
}