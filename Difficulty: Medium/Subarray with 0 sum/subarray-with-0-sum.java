class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        HashSet<Integer> set = new HashSet<>();
        int prefix=0;
        for(int i=0;i<arr.length;i++){
            prefix+=arr[i];
            if(prefix==0)return true;
            else if(set.contains(prefix)){
                return true;
            }else{
                set.add(prefix);
            }
        }
        return false;
    }
}