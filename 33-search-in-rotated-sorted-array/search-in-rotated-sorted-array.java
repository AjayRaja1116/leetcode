class Solution {
    public int search(int[] nums, int target) {
        boolean sum=false;
        int n=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                sum=true;
                n=i;
            }
        }
        if(sum)
        {
            return n;
        }
        else
        {
            return -1;
        }
    }
}