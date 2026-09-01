import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
         HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(int num:map.keySet())
        {
            if(map.get(num)>nums.length/2)
            {
                return num;
            }
        }
        return -1;
    }
}