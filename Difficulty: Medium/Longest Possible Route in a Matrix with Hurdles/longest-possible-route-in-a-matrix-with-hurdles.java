class Solution {
    public int longestPath(int[][] mat, int xs, int ys, int xd, int yd) {
        // code here
         
        if(mat[xs][ys]==0||mat[xd][yd]==0)return -1;
        return dfs(mat , xs , ys , xd , yd);
    }
    static int dfs(int[][] mat , int i ,int j, int x , int y){
        int m = mat.length;
        int n = mat[0].length;
        
        if(i==x && j==y)return 0;
        
        if(i<0 || i>=m || j<0 || j>=n || mat[i][j]==0)return -1;
        mat[i][j]=0;
        int maxpath=-1;
        int[] row ={-1,1,0,0};
        int[] col = {0,0,-1,1};
        
        
        for(int dir=0;dir<4;dir++){
            int ni = i+row[dir];
            int nj= j+col[dir];
            int pathlength= dfs(mat , ni , nj , x, y);
            
        
        
        if(pathlength!=-1){
            maxpath=Math.max(maxpath , 1+pathlength);
        }
        }
        mat[i][j]=1;
        return maxpath;
    }
}