// // User function Template for Java

class Solution {
    public void rotate(int[] arr) {
        // code here
        int n = arr.length-1;
        int rear=arr[n];
        int j=n-1;
        for(int i=0;i<n;i++){
            arr[j+1]=arr[j];
            j--;
        }
        arr[0]=rear;
    }
}