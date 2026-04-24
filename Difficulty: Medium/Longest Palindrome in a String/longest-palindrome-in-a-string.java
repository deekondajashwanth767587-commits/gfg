
class Solution {
    static String longestPalindrome(String s) {
        // code here
        int n = s.length();
        int start =0;
        int max=0;
        for(int i=0; i< n ; i++){
            int left =i,right=i;
            while(left>=0 && right <n && s.charAt(left)==s.charAt(right)){
                if(right-left+1>max){
                    start=left;
                    max = right-left+1;
                }
                left--;
                right++;
            }
            
            left=i;
            right=i+1;
            
            while(left>=0 && right<n && s.charAt(left)==s.charAt(right)){
                if(right-left+1>max){
                    start=left;
                    max = right-left+1;
                }
                left--;
                right++;
            }
        }
        return s.substring(start , start+max);
    }
} 