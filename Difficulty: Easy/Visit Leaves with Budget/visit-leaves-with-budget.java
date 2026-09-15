/* Binary Tree Node Structure
class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/
class Solution {
    public int getCount(Node root, int k) {
        // code here
        int count =0;
        int[] freq = new int[k+1];
        findleaf(root, 1, k , freq);
        int budget=k;
        for(int level =1 ; level<=k; level++){
            if(freq[level]==0){
                continue;
            }
        
        int cantake = budget/level;
        int take = Math.min(freq[level] , cantake);
        count+=take;
        budget-= take*level;
        if(budget==0)break;
        
        }
        
        
        
        
        
        
        return count;
    }
    public void findleaf(Node node , int level , int k  , int[] freq){
        if(node==null)return;
        
        if(node.left== null && node.right==null){
            if(level<=k){
                freq[level]++;
                
            }
              return;
        }
       
        findleaf(node.left  , level+1,k,freq);
        findleaf(node.right , level+1 , k , freq);
    }
}