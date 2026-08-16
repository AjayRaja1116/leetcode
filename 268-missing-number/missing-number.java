import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> map=new HashSet<>();
        for(int num:nums)
        {
            map.add(num);
        }
        for(int i=0;i<=nums.length;i++)
        {
            if(!map.contains(i))
            {
                return i;
            }
        }
        return -1;
    }
}