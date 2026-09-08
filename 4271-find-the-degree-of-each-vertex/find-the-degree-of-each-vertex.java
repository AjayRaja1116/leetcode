class Solution {
    public int[] findDegrees(int[][] matrix) {
        int res[]=new int[matrix.length];
        int i=0;
        for(int[] arr:matrix)
        {
            int sum=0;
            for(int num:arr) sum+=num;

            res[i]=sum;
            i++;
        }
        return res;
    }
}