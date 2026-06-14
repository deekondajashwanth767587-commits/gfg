class Solution {
    public List<Integer> exitPoint(int[][] mat) {
        // code here
        int row =0;
        int col=0;
        int direction =0;
        int n = mat.length;
        int m = mat[0].length;
        while(row<n && row>=0 && col>=0 && col<m){
            if(mat[row][col]==1){
                direction=(direction+1)%4;
                mat[row][col]=0;
            }
            if(direction==0){
                col++;
            }else if(direction ==1){
                row++;
            }else if(direction==2){
                col--;
            }else{
                row--;
            }  
        }
        if(direction==0){
                col--;
            }else if(direction ==1){
                row--;
            }else if(direction==2){
                col++;
            }else{
                row++;
            }
            List<Integer>ans = new ArrayList<>();
            ans.add(row);
            ans.add(col);
            return ans;
        
    }
}