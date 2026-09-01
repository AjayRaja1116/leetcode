import java.util.*;
class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums)
        {
            if(num%2==0)
            {
            map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        int ans=-1;
        int max=0;
        for(int num:map.keySet())
        {
            if(map.get(num)>max||(map.get(num)==max&&num<ans))
            {
                ans=num;
                max=map.get(num);
            }
        }
        return ans;
    }
}