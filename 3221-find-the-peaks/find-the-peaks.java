class Solution {
    public List<Integer> findPeaks(int[] mountain) {
       List<Integer> list=new ArrayList<>();
       int first=0;
       int last=mountain.length-1;
       for(int i=0;i<mountain.length;i++)
       {
            if(i!=first&&i!=last)
            {
                if(mountain[i]>mountain[i-1]&&mountain[i]>mountain[i+1])
                {
                    list.add(i);
                }
            }
       } 
       return list;
    }
}