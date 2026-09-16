class Solution {
    public static int intersectSize(int a[], int b[]) {
        // Your code here
        int count =0;
        
        HashSet<Integer> map = new HashSet<>();
        if(a.length<b.length){
            for(int i=0;i<a.length;i++){
                map.add(a[i]);
            }
        }else{
            for(int i=0;i<b.length;i++){
                map.add(b[i]);
            }
        }
        if(a.length<b.length){
            for(int i=0;i<b.length;i++){
            if(map.contains(b[i])){
                count++;
            }
            }
        }else{
            for(int i=0;i<a.length;i++){
                 if(map.contains(a[i])){
                count++;
            }
            }
        }
        
        
        
        
        
        
        return count;
    }
}