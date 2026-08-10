class Solution {
    public static int getMaxArea(int arr[]) {
        // code here
        int maxarea =0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<=arr.length;i++){
            int current = (i==arr.length)?0 :arr[i];
            
            while( !stack.isEmpty() && current<arr[stack.peek()]  ){
                int width ;
                int height = arr[stack.pop()];
                if(stack.isEmpty()){
                    width = i;
                }else{
                    width = i-stack.peek()-1;
                }
                int area = height*width;
                maxarea = Math.max(area , maxarea);
            }
            
            stack.push(i);
            
        }
        
        
        
        
        return maxarea ;
    }
}
