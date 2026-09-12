class Solution {
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        int first=searchfirst(arr  , x);
        int second = searchsecond(arr  , x);
        ArrayList<Integer> result = new ArrayList<>();
        result.add(first);
        result.add(second);
        return result;
    }
    public int searchfirst(int[] arr  , int x){
        int low = 0;
        int high = arr.length-1;
        int ans =-1;
        while(low<=high){
            int mid = (high+low)/2;
            if(arr[mid] == x ){
                ans=mid;
                high=mid-1;
            }else if(arr[mid]<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public int searchsecond(int[] arr  , int x){
         int low = 0;
        int high = arr.length-1;
        int ans =-1;
        while(low<=high){
            int mid = (high+low)/2;
            if(arr[mid] == x ){
                ans=mid;
                low=mid+1;
            }else if(arr[mid]<x){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
         return ans;
    }
}
