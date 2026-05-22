class Solution {
    int cntOnes(int[][] grid) {
        // code here
        int n =grid.length;
        int m =grid[0].length;
        Queue<int[] > queue= new LinkedList<>();
        for(int i=0;i<n;i++){
            if(grid[i][0]==1){
                queue.offer(new int[]{i,0});
                grid[i][0]=0;
                
            }
            if(grid[i][m-1]==1){
                queue.offer(new int[]{i,m-1});
                grid[i][m-1]=0;
            }
        }
        for(int j=0;j<m;j++){
            if(grid[0][j]==1){
                queue.offer(new int[]{0,j});
                grid[0][j]=0;
            }
            if(grid[n-1][j]==1){
                queue.offer(new int[]{n-1,j});
                grid[n-1][j]=0;
            }
        }
        
        
        int[] row ={0,0,1,-1};
        int[] col ={1,-1,0,0};
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int r = current[0];
            int c= current[1];
            for(int k=0;k<4;k++){
                int nr=r+row[k];
                int nc= c+col[k];
                
                if(nr>=0 && nr<n && nc>=0 && nc<m && grid[nr][nc]==1){
                    queue.offer(new int[]{nr , nc});
                    grid[nr][nc] = 0;
                }
            }
        }
        int count=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1)count++;
            }
        }
        return count;
        
    }
};