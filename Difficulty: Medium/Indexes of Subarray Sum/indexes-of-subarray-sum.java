
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> res= new ArrayList<>();
        int result=0;
        int left=0;
        for(int i=0;i<arr.length;i++){
                result+=arr[i];
            while(result>target){
                result-=arr[left];
                left++;
            }
            if(result==target){
                res.add(left+1);
                res.add(i+1);
                return res;
        }
        }
        
        res.add(-1);
        return res;
    }
}
