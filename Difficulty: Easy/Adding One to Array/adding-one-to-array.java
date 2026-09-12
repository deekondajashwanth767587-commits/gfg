class Solution {
    // Function for adding one to the number represented by the array
    Vector<Integer> addOne(int[] arr) {
        // code here
         Vector<Integer> result = new Vector<>();
        int n = arr.length;
        for(int i=n-1 ; i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                for(int j:arr){
                    result.add(j);
                }
                return result;
                
            }
            arr[i]=0;
            
        }
        result.add(1);
        for(int i=0;i<n;i++){
            result.add(0);
        }
        return result;
    }
}