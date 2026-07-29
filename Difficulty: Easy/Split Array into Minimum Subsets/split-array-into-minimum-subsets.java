class Solution {
    int minSubsets(int arr[]) {
        int result=0;       // code here
        Set<Integer> s = new HashSet<>();
        for(int num :arr){
            s.add(num);
        }
        for(int num: arr){
            if(!s.contains(num-1)){
                result++;
            }
        }
        return result;
        
    }
}