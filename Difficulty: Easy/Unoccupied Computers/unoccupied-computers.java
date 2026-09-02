class Solution {
    public int solve(int n, String s) {
        // code here
         int[] state = new int[26];
         int avalable = n;
         int  rejected=0;
         for(int i=0;i<s.length();i++){
             char c = s.charAt(i);
             int index= c-'A';
             if(state[index]==0){
                 if(avalable>0){
                     
                 
                 state[index]=1;
                 avalable--;
                 }
             else{
                 state[index]=2;
                 rejected++;
             }
             }else{
                 if(state[index]==1){
                     avalable++;
                     state[index]=0;
                 }
             }
         }
         return rejected;
    }
}
