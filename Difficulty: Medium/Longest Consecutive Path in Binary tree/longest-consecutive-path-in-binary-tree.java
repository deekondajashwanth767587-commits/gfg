/* Structure of Binary Tree Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
}*/
class Solution {
    public int longestConsecutive(Node root) {
        // code here
        if(root==null ){
            return -1;
            
        }
        int[] longestpath={0};
        dfs(root , null , 0 , longestpath);
        return (longestpath[0]==1?-1:longestpath[0]);
        
    }
    public void dfs(Node node , Node parent , int currentlen , int[] longestpath){
        if(node==null)return ;
        if(parent !=null && node.data==parent.data+1){
            currentlen++;
        }else{
            currentlen=1;
        }
        longestpath[0]=Math.max(longestpath[0] , currentlen);
        dfs(node.left,  node , currentlen , longestpath);
        dfs(node.right , node , currentlen , longestpath);
    }
}