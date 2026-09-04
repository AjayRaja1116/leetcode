class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean ok=true;
        boolean notok=true;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]<nums[i+1])
            {
                notok=false;
            }
            if(nums[i]>nums[i+1])
            {
                ok=false;
            }
        }
        return ok || notok;
    }
}