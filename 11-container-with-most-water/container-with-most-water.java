class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int rigth=height.length-1;
        int maxarea=0;
        while(left<rigth)
        {
            int width=rigth-left;
            int h=Math.min(height[left],height[rigth]);
            int area=width*h;
            maxarea=Math.max(maxarea,area);
            if(height[left]<height[rigth])
            {
                left++;
            }
            else
            {
            rigth--;
            }
        }
        return maxarea;
    }
}