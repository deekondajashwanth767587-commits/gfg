class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        Stack<Integer> stack = new Stack<>();
        // step 1 push all person s into the stack
        for(int i=0;i<n ;i++){
            stack.push(i);
        }
        // step 2 pop two elements and then checj=k the relations between them 
        //by eliminating the no celebrity
        while(stack.size()>1){
            int a = stack.pop();
            int b = stack.pop();
            if(mat[a][b]==1){
                stack.push(b);
            }else{
                stack.push(a);
            }
        }
        
            
        int a = stack.pop();
        for(int i=0;i<n;i++){
             if(a==i)continue;
             else{
                 if(mat[a][i]==1 || mat[i][a] ==0 )return -1;
             }
        }
         
        
        return a;
    }
}