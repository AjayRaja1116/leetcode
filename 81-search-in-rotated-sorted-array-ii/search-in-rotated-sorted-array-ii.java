class Solution {
    public boolean search(int[] nums, int target) {
        boolean sum=false;
        for(int num:nums)
        {
            if(num==target)
            {
                sum=true;
            }
        }
        if(sum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}