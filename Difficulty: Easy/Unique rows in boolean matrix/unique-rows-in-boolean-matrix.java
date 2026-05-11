class Solution {
    public ArrayList<ArrayList<Integer>> uniqueRow(int[][] mat) {
        // code here
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int[] row :mat){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int val:row){
                temp.add(val);
            }
            if(!set.contains(temp)){
                set.add(temp);
                result.add(temp);
            }
        }
        return result;
    }
}