class Solution {
    public int visibleBuildings(int arr[]) {
        // code here
        if(arr.length==0)return 0;
        int count=1;
        int max =arr[0];
        for(int i=1;i<arr.length ; i++){
            if(arr[i]>=max){
                count++;
                max=arr[i];
            }
        }
        return count;
    }
}