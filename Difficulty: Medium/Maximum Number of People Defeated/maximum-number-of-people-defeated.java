class Solution {
    int maxPeopleDefeated(int p) {
        // code here
         int count=0;
         long i=1;
         while(p>=i*i){
             p-=i*i;
             count++;
             i++;
         }
         return count;
        
        
    }
};