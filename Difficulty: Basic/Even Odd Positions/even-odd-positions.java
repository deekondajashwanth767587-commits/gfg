class Solution {

    public long totalFine(int date, int car[], int fine[]) {
        // code here
        long result =0;
        if(date%2==0){
            for(int i=0;i<car.length;i++){
                if(car[i]%2!=0){
                    result+=fine[i];
                }
            }
        }else{
            for(int i=0;i<car.length;i++){
                if(car[i]%2==0){
                    result+=fine[i];
                }
            }
        }
        
        
        
        return result;
    }
}