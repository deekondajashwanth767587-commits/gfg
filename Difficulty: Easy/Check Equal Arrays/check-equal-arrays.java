class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        if(a.length!=b.length)return false;
        HashMap<Integer , Integer> map= new HashMap<>();
        for(int x:a){
           map.put(x, map.getOrDefault(x, 0) + 1); 
        }
        for(int x:b){
            if(!map.containsKey(x)) return false;
            int freq = map.get(x);
            if(freq==1){
                map.remove(x);
            }else{
                map.put(x,freq-1);
            }
             
        }
        return map.isEmpty();
    }
}