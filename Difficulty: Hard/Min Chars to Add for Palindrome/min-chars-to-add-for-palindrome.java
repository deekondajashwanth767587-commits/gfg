class Solution {
    public int minChar(String s) {
        // code here
        String rev = new StringBuilder(s).reverse().toString();
        String temp =s+'@'+rev;
        int[] lps = buildlps(temp);
        return s.length()-lps[temp.length()-1];
        
    }
    public int[] buildlps(String str){
        int n = str.length();
        int[] lps = new int[n];
        int len =0;
        int i=1;
        while(i<n){
            if(str.charAt(i)==str.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len=lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
                
            }
        }
        return lps;
    }
}