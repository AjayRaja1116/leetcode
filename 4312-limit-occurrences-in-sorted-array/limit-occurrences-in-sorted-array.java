class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        List<Integer> list=new ArrayList<>();
        int prev=-1;
        int index=0;
        int count=0;
        for(int num:nums)
        {
            if(num==prev)
            {
                count++;
            }
            else
            {
                prev=num;
                count=1;
            }
            if(count<=k)
            {
                list.add(num);
            }
        }
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i]=list.get(i);
        }
        return arr;
    }
}