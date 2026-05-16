class Solution {
    ArrayList<Integer> search(String pat, String txt) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int[] lps = buildlps(pat);
        int i=0;
        int j=0;
        while(i<txt.length()){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
            }
            if(j==pat.length()){
                result.add(i-j);
                j=lps[j-1];
            }else if(i<txt.length() && txt.charAt(i)!=pat.charAt(j)){
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
        
        
        return result;
    }
    private int[] buildlps(String pat){
        int n = pat.length();
        int[] lps = new int[n];
        int len =0;
        int i=1;
        while(i<n){
            if(pat.charAt(i)==pat.charAt(len)){
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