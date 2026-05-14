class Solution {
    public ArrayList<Integer> search(int[] a, int[] b) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        int n = a.length;
        int m = b.length;
        int[] lps = new int[m];
        buildlps(b,lps);
        int j = 0;
        int i=0;
        while(i<n){
            if(a[i]==b[j]){
                i++;
                j++;
            }
            if(j==m){
                result.add(i-m);
                j=lps[j-1];
            }else if(i<n && a[i]!=b[j]){
                if(j!=0){
                    j=lps[j-1];
                    
                }else{
                    i++;
                }
            }
        }
        
        return result;
    }
    public void buildlps(int[] b , int[] lps){
        int len =0;
        int i=1;
        while(i<b.length){
            if(b[i]==b[len]){
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
    }
}