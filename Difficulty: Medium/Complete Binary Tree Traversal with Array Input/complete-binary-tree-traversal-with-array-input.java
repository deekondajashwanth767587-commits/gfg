class Solution {
    
     
    public ArrayList<ArrayList<Integer>> levelSort(int[] arr) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        int i=0;
        int levelsize=1;
        while(i<arr.length){
            ArrayList<Integer> levelorder= new ArrayList<>();
            for(int j=0;j<levelsize && i+j<arr.length;j++){
                levelorder.add(arr[i+j]);
            }
            Collections.sort(levelorder);
            result.add(levelorder);
            i+=levelorder.size();
            levelsize=2*levelsize;
        }
        return result;
        
    }
}