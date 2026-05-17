class Solution {
    List<Integer> makeBeautiful(int[] arr) {
        // code here
      
        Stack<Integer> s = new Stack<>();
         
        int i=0;
        while(i<arr.length){
             
            
            if(!s.isEmpty() &&( (s.peek()>=0 && arr[i]<0) ||(s.peek()<0 && arr[i]>=0))){
                s.pop();
               
            }else{
                s.push(arr[i]);
            }          
            i++;
        }
        
        
        
        return new ArrayList<>(s);
    }
}