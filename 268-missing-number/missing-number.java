class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length ;
        int sum =  n * (n + 1) / 2 ;
        int x=0 ;
        for (int i =0 ; i < nums.length ; i++ ){
            x = x + nums[i];
        }
        int ans = sum - x ;
        return ans ;
    }
}