class Solution {
    public int smallestSubstring(String s) {
        // code here
        int result =Integer.MAX_VALUE;
        int count0=0;
        int count1=0;
        int count2=0;
        int left =0;
    
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')count0++;
            else if(s.charAt(i)=='1')count1++;
            else count2++;
            while(count1>0 && count0 >0 && count2>0){
                result  = Math.min(result ,i-left+1);
               
               char remove = s.charAt(left);
               if(remove=='0')count0--;
               else if(remove=='1')count1--;
               else count2--;
               
                left++;
                
            }
        }
        
        
        
        return result==Integer.MAX_VALUE?-1:result;
    }
};
