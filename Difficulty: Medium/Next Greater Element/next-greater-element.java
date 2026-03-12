class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
         ArrayList<Integer> res = new ArrayList<>();
         int n = arr.length;
         int[] result = new int[n];
        for(int i=n-1;i>=0;i--){
            if(!stack.isEmpty() && stack.peek()>arr[i] ){
                result[i]=stack.peek();
            }
            else{
                
                while( !stack.isEmpty( ) && stack.peek()<=arr[i]){
                    stack.pop();
                }
                
                if(stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            }
            stack.push(arr[i]);
        }
        for(int x:result){
            res.add(x);
        }
        return res;
    }
}