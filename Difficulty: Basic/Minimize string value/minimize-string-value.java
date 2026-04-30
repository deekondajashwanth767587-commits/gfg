// User function Template for Java

class Solution {
    int minValue(String S, int K) {
        // code here
        int result = 0;
        int[] freq = new int[26];
        for(char c :S.toCharArray()){
            freq[c-'a']++;
        }    
        for(int k=0;k<K;k++){
            int max=0;
            for(int i=1;i<26;i++){
                if(freq[i]>freq[max]){
                    max=i;
                }
                
            }
            if(freq[max]>0)freq[max]--;
        }
        for(int i:freq){
            result+=i*i;
        }
                
                
        return result;

    }
}