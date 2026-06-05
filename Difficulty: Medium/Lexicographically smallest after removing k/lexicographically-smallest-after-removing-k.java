class Solution {
    public String lexicographicallySmallest(String s, int k) {
        // code here
        int  n = s.length();
        if((n&(n-1))==0){
            k=k/2;
        }else{
            k=k*2;
        }
        if(k>=n)return "-1";
        Stack<Character>stack = new Stack<>();
        int deletion =k;
        for(char ch :s.toCharArray()){
            while(!stack.isEmpty() && deletion >0 && stack.peek()>ch){
                stack.pop();
                deletion--;
            }
            stack.push(ch);
        }
        while(deletion >0){
            stack.pop();
            deletion--;
        }
        StringBuilder ans = new StringBuilder();
        for(char ch :stack){
            ans.append(ch);
        }
        return ans.length()==0?"-1":ans.toString();
        
        
    
    }
}