class Solution {
    int countPairs(int[][] mat1, int[][] mat2, int x) {
        // code here
        int n = mat1.length;
        int count =0;
        int i=0;
        int j =(n*n -1);
        while(i<n*n && j>=0){
            int r1 = i/n;
            int c1 = i%n;
            int r2 = j/n;
            int c2 = j%n;
            int target = mat1[r1][c1]+mat2[r2][c2];
            if(target==x){
                i++;
                j--;
                count++;
            }else if( target<x){
                i++;
            }else{
                j--;
            }
        }
        
        return count;
    }
}