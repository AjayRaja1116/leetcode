class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] freq = new int[128];
        for(char ch: s.toCharArray()) freq[ch]++;
        for(char ch: t.toCharArray()) freq[ch]--;
        for(char ch: s.toCharArray()){
            if(freq[ch]!=0) return false;
        }
        return true;
    }
}

// s = "car"
// t = "rac"