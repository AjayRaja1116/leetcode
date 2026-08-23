class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prod=1;
        while(n>0)
        {
            sum=n%10+sum;
            prod=n%10*prod;
            n=n/10;
        }
        return prod-sum;
    }
}