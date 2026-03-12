class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        int n = s.size();
        deletemiddle(s,n/2);
        
    }
    void deletemiddle(Stack<Integer> s , int k){
        if(k==0){
            s.pop();
            return ;
        }
        int temp = s.pop();
        deletemiddle(s,k-1);
        s.push(temp);
    }
}