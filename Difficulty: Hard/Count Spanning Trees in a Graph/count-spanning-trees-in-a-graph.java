class Solution {
    public int countSpanTree(int n, int[][] edges) {
        // code here
        // in notes 
        if(n==1)return 1;
        int[][] lap = new int[n][n];
        for(int[] edge:edges){
            int u = edge[0];
            int v = edge[1];
            lap[u][u]++;
            lap[v][v]++;
            
            lap[u][v]--;
            lap[v][u]--;
        }
            int[][] cofactor = new int[n-1][n-1];
            for(int i=1; i<n;i++){
                for(int j=1;j<n;j++){
                    cofactor[i-1][j-1]=lap[i][j];
                }
            }
            
            return determinant(cofactor , n-1);
        
    }
    public int determinant(int[][] matrix , int size){
        if(size==1)return matrix[0][0];
        if(size==2){
            return matrix[0][0]*matrix[1][1]-matrix[0][1]*matrix[1][0];
        }
        int det=0;
        int[][] temp = new int[size][size];
        int sign= 1;
        for(int col =0; col<size;col++){
            getminor(matrix , temp , 0,col, size);
            det+=sign*matrix[0][col]*determinant(temp , size-1);
            sign=-sign;
        }
        return det;
        
    }
    public void getminor(int[][] matrix , int[][] temp , int row , int col , int size){
        int r =0;
        int c =0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i!=row && j!=col){
                    temp[r][c++]=matrix[i][j];
                    if(c==size-1){
                        c=0;
                        r++;
                    }
                }
            }
        }
        
    }
}