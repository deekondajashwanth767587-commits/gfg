class Solution {
    public int longestSubstr(String s, int k) {
        // code here
        int left =0;
        int maxlen=0;
        int maxfreq =0;
        int[] freq= new int[26];
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            
            freq[c-'A']++;
            maxfreq = Math.max(maxfreq, freq[c-'A']);
            int window = i-left+1;
            if(window-maxfreq>k){
                char remove = s.charAt(left);
                freq[remove-'A']--;
                left++;
            }
            maxlen= Math.max(maxlen , i-left+1);
        }
        
        
        
        
        
        
        return maxlen;
    }
}
