class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int sum=0;
        boolean zero=false;
        for(int num:nums)
        {
            sum^=num;
            if(num!=0)
            {
                zero=true;
            }
        }
        if(sum!=0)
        {
            return n;
        }
        if(!zero)
        {
            return 0;
        }
        return n-1;
    }
}