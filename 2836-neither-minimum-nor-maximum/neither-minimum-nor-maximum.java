class Solution {
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<=2)
        {
            return -1;
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int num:nums)
        {
            if(max<num)
            {
                max=num;
            }
            if(min>num)
            {
                min=num;
            }
        }
        for(int num:nums)
        {
            if(num!=min&&num!=max)
            {
                return num;
            }
        }
        return -1;
    }
}