import java.util.*;
class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums)
        {
            set.add(num);
        }
        int miss=k;
        for(int n:set)
        {
            if(set.contains(miss))
            {
                miss=miss+k;
            }
        }
        return miss;
    }
}