class Solution {
    public boolean isSubSeq(String s1, String s2) {
        // code here
        int j=0;
          if (s1.length() == 0) return true;
        
        for(int i=0;i<s2.length();i++){
            if( j<s1.length() && s1.charAt(j)==s2.charAt(i))j++;
            if(j==s1.length())return true;
        }
        return j==s1.length();
        
    }
     
};