class Solution {
    public int minAddToMakeValid(String s) {
        int minopen=0;
        int minreq=0; 
        for(char c:s.toCharArray()){
            if(c=='('){
                minopen++;
            }
            else{
                if(minopen>0){
                    minopen--;
                }
                else{
                    minreq++;
                }
            }
        }
        return minopen+minreq;
    }
}