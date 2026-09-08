class Solution {
    public ArrayList<ArrayList<Integer>> searchWord(char[][] mat, String word) {
        // code here
        int n = mat.length;
        int m = mat[0].length;
        int[] dr = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dc = {-1,  0,  1, -1, 1, -1, 0, 1};
        ArrayList<ArrayList<Integer>>  ans= new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]!=word.charAt(0))continue;
                for(int d=0;d<8;d++){
                    int x = i;
                    int y = j;
                    int k ;
                    for(k=1;k<word.length();k++){
                        x+=dr[d];
                        y+=dc[d];
                        if(x<0 || x>=n || y<0 || y>=m)break;
                        if(mat[x][y]!=word.charAt(k))break;
                    }
                    if(k==word.length()){
                        ArrayList<Integer> pos = new ArrayList<>();
                        pos.add(i);
                        pos.add(j);
                        ans.add(pos);
                        break;
                    }
                }
                
            }
        }
        return ans;
        
        
    }
};