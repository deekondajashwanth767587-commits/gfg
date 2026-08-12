class Solution {
    public ArrayList<Integer> findWays(int[][] grid) {
        // Code here
        int n = grid.length;
        
        int m = 1_000_000_007;
        long[][] paths = new long[n][n];
        int[][] maxadventure = new int[n][n];
        paths[0][0]=1;
        maxadventure[0][0]=grid[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<n ;j++){
                if(i==0 && j==0){
                    continue;
                }
                paths[i][j]=0;
                maxadventure[i][j]=-1;
                if(j>0 && (grid[i][j-1]==1|| grid[i][j-1]==3)){
                    paths[i][j]=(paths[i][j]+paths[i][j-1])%m;
                    maxadventure[i][j]=Math.max(maxadventure[i][j] , maxadventure[i][j-1]);
                }
                if(i>0 && (grid[i-1][j]==2 || grid[i-1][j]==3 )){
                    paths[i][j]=(paths[i][j]+paths[i-1][j])%m;
                    
                    maxadventure[i][j] = Math.max(maxadventure[i][j] , maxadventure[i-1][j]);
                }
                if(maxadventure[i][j]!=-1){
                    maxadventure[i][j]+=grid[i][j];
                }
            }
        }
     ArrayList<Integer> result = new ArrayList<>();
     result.add((int)paths[n-1][n-1]);
     if (paths[n - 1][n - 1] == 0) {
    result.add(0);
} else {
    result.add(maxadventure[n - 1][n - 1]);
}
     return result;
    }
    
}