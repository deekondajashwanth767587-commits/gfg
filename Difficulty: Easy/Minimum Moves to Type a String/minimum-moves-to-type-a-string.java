class Solution {
    public int minMoves(String s) {
        // code here
        int result=0;
        int i=0;
        int j=0;
        for(int x=0;x<s.length();x++){
            
            char ch = s.charAt(x);
            
            int nexti= (ch-'a')/5;
            int nextj =(ch-'a')%5;
            
            while(i>nexti){
                result++;
                i--;
            }
            while(j>nextj){
                result++;
                j--;
            }
            while(i<nexti){
                result++;
                i++;
        }
        while(j<nextj){
            result++;
            j++;
        }
        result++;
        
        }
        
        return result;
    }
}