class Solution {
    public boolean palindromePair(String[] arr) {
        // Code here
        int n = arr.length;
        HashMap<String , Integer> map =new HashMap<>();
        for(int i=0;i<n ;i++){
            map.put(arr[i],i);
        }
        for(int i=0;i<n ;i++){
            String word = arr[i];
            int len = word.length();
            for(int cut=0; cut<=len;cut++){
                String left=word.substring(0,cut);
                String right= word.substring(cut);
                
                
                if(ispalindrome(left)){
                    String reverseright = new StringBuilder(right).reverse().toString();
                    if(map.containsKey(reverseright) && map.get(reverseright)!=i)return true;
                }
                
                if(cut!=len && ispalindrome(right)){
                    String reverseleft = new StringBuilder(left).reverse().toString();
                    if(map.containsKey(reverseleft) &&  map.get(reverseleft)!=i)return true;
                }
            }
        }
        return false;
    }
    
    
    public boolean ispalindrome(String s){
        int left =0;
        int right = s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right))return false;
            left++;
            right--;
            
        }
        return true;
    }
    
    
    
    
}