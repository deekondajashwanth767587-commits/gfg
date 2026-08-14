class Solution {
    public static boolean matSearch(int mat[][], int x) {
        // code here
        int i=0;
        int n  = mat.length;
        int m = mat[0].length;
        
        int j =m-1;
        while(i<n && j>=0){
            if(mat[i][j]==x){
                return true;
            }
            if(mat[i][j]<x){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
}