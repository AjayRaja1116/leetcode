class Solution {
    public int findSpecialInteger(int[] arr) {
      int count=1;
      double percent=arr.length*(0.25);
      if(arr.length==1)
      {
        return arr[arr.length-1];
      }
      for(int i=1;i<arr.length;i++)
      {
        if(arr[i]==arr[i-1])
        {
            count++;
        }
        else
        {
            count=1;
        }
        if(count>percent)
        {
            return arr[i];
        }
      }
      return -1;  
    }
}