class Solution {
    public int findPeakElement(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        int peak=arr[nums.length-1];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==peak)
            {
                return i;
            }
        }
        return -1;
    }
}