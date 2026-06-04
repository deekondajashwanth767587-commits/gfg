class Solution {
    int maxSubstring(String s) {
        // code here
      
        int max =0;
        int current=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                current+=1;
            }else{
                if((current-1)<0){
                    current=0;
                }else{
                    current--;
                }
            }
            max= Math.max(current , max);
        }
        return max==0 ? -1: max;
    }
}