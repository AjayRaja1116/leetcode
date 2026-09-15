class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> list=new ArrayList<>();
        list.add(words[0]);
        for(int i=1;i<words.length;i++){
            int a[]=new int[26];
            int b[]=new int[26];
            for(char c:list.get(list.size()-1).toCharArray()){
                a[c-'a']++;
            }
            for(char c:words[i].toCharArray()){
                b[c-'a']++;
            }
            if(!Arrays.equals(a,b)){
                list.add(words[i]);
            }
        }
        return list;
    }
}