class Solution {
    public int xorOperation(int n, int start) {
        int sum=start;
        int add=start;
        for(int i=2;i<=n;i++)
        {
            add=add+2;
            sum=sum^add;
        }
        return sum;
    }
}