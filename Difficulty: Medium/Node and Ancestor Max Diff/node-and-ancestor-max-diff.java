/* Structure of binary tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    int maxDiff(Node root) {
        //  code here
        if(root== null)return 0;
        return Math.max(
            dfs(root.left , root.data),
            dfs(root.right , root.data)
            );
    }
    int dfs(Node node , int max){
        if(node==null )return Integer.MIN_VALUE;
        int current = max-node.data;
        int newmax = Math.max(max  , node.data);
        int left= dfs(node.left , newmax);
        int right = dfs(node.right , newmax);
        return Math.max(current , Math.max(left , right));
    }
}