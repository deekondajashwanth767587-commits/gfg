class Solution {
    int unvisitedLeaves(int arr[], int k) {
        // code here
        boolean[] visited = new boolean[k+1];
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)return 0;
            int x= arr[i];
            
            while(x<=k){
                visited[x]=true;
                x=x+arr[i];
                
            }
        }
        int count =0;
        for(int i=1;i<=k;i++){
            if(visited[i]==false){
                count++;
            }
        }
       
       return  count;
    }
}