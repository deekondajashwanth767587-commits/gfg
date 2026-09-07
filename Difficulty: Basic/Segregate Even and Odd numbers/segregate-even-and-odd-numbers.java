class Solution {
    void segregateEvenOdd(int arr[]) {
        // code here
        // innote book big
        int j=0;
        int boundary=-1;
        for(int i=0; i<arr.length;i++){
            
            if(arr[i]%2==0){
                
                boundary++;
                if(boundary<i){
                    int temp = arr[boundary];
                    arr[boundary]=arr[i];
                    arr[i]=temp;
                }
            } 
            
            
            
            
        }
        Arrays.sort(arr , 0, boundary+1);
         Arrays.sort(arr, boundary+1 , arr.length);
        
    }
}