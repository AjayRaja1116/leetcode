class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ans=0;
        for(int pens=0;pens*cost1<=total;pens++)
        {
            int rem=total-pens*cost1;
            ans=ans+rem/cost2+1;
        }
        return ans;
    }
}