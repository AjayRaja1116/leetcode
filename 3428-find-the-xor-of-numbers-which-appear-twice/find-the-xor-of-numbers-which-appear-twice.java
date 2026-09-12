import java.util.*;
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int prod=0;
        for(int num:nums)
        {
            if(map.containsKey(num))
            {
                prod^=num;
            }
            else
            {
                map.put(num,0);
            }
        }
        return prod;
    }
}