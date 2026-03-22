class Solution {
    public int orangesRot(int[][] mat) {
        // code here
        int n = mat.length;
        int m= mat[0].length;
        Queue<int[] > queue = new LinkedList<>();
        int fresh =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m ;j++){
                if(mat[i][j]==2)queue.offer( new  int[]{i,j});
                else if(mat[i][j]==1)fresh++;
            }
        }
        
        int[][] directions ={{-1,0},{1,0},{0,-1},{0,1}};
        int time=0;
        while(!queue.isEmpty() && fresh>0){
            int size= queue.size();
            boolean rot=false;
            
            for(int i=0;i<size;i++){
                int[] curr = queue.poll();
                int x =curr[0],y=curr[1];
                
                
                for(int[] d :directions){
                    int nx=x+d[0];
                    int ny = y+d[1];
                    
                    if(nx>=0 && ny>=0 && nx<n &&  ny<m && mat[nx][ny]==1){
                        mat[nx][ny]=2;
                        queue.offer(new int[]{nx , ny});
                        fresh--;
                        rot=true;
                    }
                }
            }
            if(rot) time++;
        }
        return (fresh==0)?time:-1;
    }
}