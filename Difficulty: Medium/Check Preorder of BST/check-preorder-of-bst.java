class Solution {
    public boolean canRepresentBST(List<Integer> arr) {
        // code here
        boolean ans = true;
        int root = Integer.MIN_VALUE;
        Stack<Integer> stack = new Stack<>();
        for(int i:arr){
            if(i<root){
                return false;
            }
            while(!stack.isEmpty()  && stack.peek()<i){
                root = stack.pop();
                
            }
            stack.push(i);
            
        }
        
        
        return ans;
        
    }
}