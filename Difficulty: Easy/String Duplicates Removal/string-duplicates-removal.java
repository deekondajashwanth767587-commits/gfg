class Solution {
    String removeDuplicates(String s) {
          StringBuilder result = new StringBuilder();
        boolean[] visited = new boolean[52];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int index;
            if(ch>='A'&& ch<='Z'){
                index=ch-'A';
            }else{
                index=26+(ch-'a');
            }
            if(!visited[index]){
                visited[index]=true;
                result.append(ch);
            }
            
            
        }
        return result.toString();
        
        
    }
}
