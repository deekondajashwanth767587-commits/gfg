class Solution {
    int shortestPath(int[][] mat) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
         Queue<int[]> q = new LinkedList<>();
         
         for (int i = 0; i < n; i++) {
                     for (int j = 0; j < m; j++) {

                         if (mat[i][j] == 0) {
                             q.offer(new int[]{i, j});
                         }
                     }
                 }
                 
                 
        while (!q.isEmpty()) {

                    int[] curr = q.poll();

                    int r = curr[0];
                    int c = curr[1];

 
                    mat[r][c] = -1;

                    
                    for (int d = 0; d < 4; d++) {

                        int nr = r + dr[d];
                        int nc = c + dc[d];

                        if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
                            mat[nr][nc] = -1;
                        }
                    }
                }
                
                
                  int[][] dist = new int[n][m];
                  for (int i = 0; i < n; i++) {
                              Arrays.fill(dist[i], -1);
                          }
             q = new LinkedList<>();
             for (int i = 0; i < n; i++) {

                        if (mat[i][0] == 1) {
                            q.offer(new int[]{i, 0});
                            dist[i][0] = 1;
                        }
                    }
            while (!q.isEmpty()) {

                        int[] curr = q.poll();

                        int r = curr[0];
                        int c = curr[1];

                      
                        if (c == m - 1) {
                            return dist[r][c];
                        }

                  
                        for (int d = 0; d < 4; d++) {

                            int nr = r + dr[d];
                            int nc = c + dc[d];

                            
                            if (nr < 0 || nr >= n || nc < 0 || nc >= m) {
                                continue;
                            }

                           
                            if (mat[nr][nc] == 1 && dist[nr][nc] == -1) {

                                dist[nr][nc] = dist[r][c] + 1;

                                q.offer(new int[]{nr, nc});
                            }
                        }
                    }
                       return -1;
        
    }
}
