class Solution {
    public int thirdLargest(List<Integer> arr) {
        // code here
        int max1=-1;
        int max2=-1;
        int max3=-1;
        
        for(int i=0;i<arr.size();i++){
            int x = arr.get(i);
            if(x>max1){
                max3= max2;
                max2=max1;
                max1=x;
                
            }else if(x>max2){
                max3=max2;
                max2=x;
            }else if(x>max3){
                max3=x;
            }
        }
        
        
        return max3;
    }
}