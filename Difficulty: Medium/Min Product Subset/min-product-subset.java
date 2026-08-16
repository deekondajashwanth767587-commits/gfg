class Solution {
    public int minProd(int[] arr) {
        // code here
        int product =1 ;
        int negativecount =0;
        int negative_near_zero=Integer.MAX_VALUE;
        int minimum_element=Integer.MAX_VALUE;
        
        for(int i:arr){
            if(i<0){
                
                negativecount++;
                negative_near_zero = Math.min( Math.abs(i) , negative_near_zero);
            }else{
                minimum_element = Math.min(minimum_element , i);
            }
             if(i!=0){
                 product*=i;
             }
        }
        if(negativecount==0){
            return minimum_element;
        }else{
            if(negativecount%2==0){
                product = -1*(product/negative_near_zero);
            }
        }
        return (product<minimum_element)?product:minimum_element ;
        
        
    }
}