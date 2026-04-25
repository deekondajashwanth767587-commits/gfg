class Solution {
    public ArrayList<Integer> reducePairs(int[] arr) {
        // code here
        Stack<Integer > s = new Stack<>();
        
        for(int i=0;i<arr.length ;i++){
            boolean alive= true;
            int current=arr[i];
            while(!s.isEmpty() && (s.peek()* current)<0  ){
                int top =Math.abs(s.peek());
                if(top>Math.abs(current)){
                    alive=false;
                    break;
                }
                else if( top<Math.abs(current)){
                    s.pop();
                }else{
                    alive =false;
                    s.pop();
                    break;
                }
            }
            
            
            if(alive){
                s.push(current);
            }
        }
        
         
         ArrayList<Integer> result = new ArrayList<>(s);
         
         
         return result;
    }
}