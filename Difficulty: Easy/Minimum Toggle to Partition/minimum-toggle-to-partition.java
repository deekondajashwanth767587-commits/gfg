class Solution {
    int minToggle(int[] arr) {
        // code here
     
     int initialones=0;
     int rightzeros=0;
     
     for(int i=0;i<arr.length;i++){
         if(arr[i]==0){
             rightzeros+=1;
         }
     }
      int lost =rightzeros+ initialones ;
     for(int i=0;i<arr.length;i++){
         if(arr[i]==0){
             rightzeros--;
         }else{
              initialones++;
         }
         lost = Math.min(lost , Math.abs(rightzeros+ initialones));
     }
     
     
     return lost;
     
    }
}