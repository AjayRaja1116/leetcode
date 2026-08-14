class Solution {
    public int firstUniqChar(String s) {
        int freq[]=new int[126];
        int sum;
        for(int i=0;i<s.length();i++)
        {
            int index=s.charAt(i)-'a';
            freq[index]++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(freq[s.charAt(i)-'a']==1)
            {
                return i;
            }
        }
        return -1;

    }
}