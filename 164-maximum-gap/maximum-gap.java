import java.util.*;
class Solution {
    public int maximumGap(int[] nums) {
        int maxnum=0;
        if(nums.length<2)
        {
            return 0;
        }
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            maxnum=Math.max(maxnum,nums[i]-nums[i-1]);
        }
        return maxnum;
    }
}