class Solution {
    public ArrayList<Integer> constructList(int[][] queries) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        
        result.add(0);
        int curxor=0;
        for(int[] query:queries){
            int type=query[0];
            int x = query[1];
            if(type==0){
                result.add(x^curxor);
            }else{
                curxor^=x;
            }
        }
        for(int i=0;i<result.size();i++){
            result.set(i, result.get(i)^curxor);
        }
        Collections.sort(result);
        
        
        return result;
    }
}