import java.util.*;
class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:map.keySet())
        {
            if(map.get(num)==2)
            {
                list.add(num);
            }
        }
        int prod=0;
        for(int num:list)
        {
            prod^=num;
        }
        return prod;
    }
}