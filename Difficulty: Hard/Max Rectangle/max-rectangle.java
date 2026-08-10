class Solution {
    public int maxArea(int mat[][]) {
        // code here
        int row = mat.length;
        int col = mat[0].length;
        int maxarea =0;
        int[] heights = new int[col];
        for(int i=0;i<row ;i++){
            for(int j=0; j<col ;j++){
                if(mat[i][j]==1){
                    heights[j]++;
                }else{
                    heights[j]=0;
                }
            }
            Stack<Integer> stack = new Stack<>();
            for(int x=0;x<=col;x++){
                int current = (x==col)?0:heights[x];
                int width;
                while(!stack.isEmpty() && current<heights[stack.peek()]){
                    int height = heights[stack.pop()];
                    
                    if(stack.isEmpty()){
                        width=x;
                    }else{
                        width=x-stack.peek()-1;
                    }
                    
                    int area = width*height;
                    maxarea = Math.max(area, maxarea);
                }
                stack.push(x);
            }
            
        }
        
        return maxarea;
    }
}