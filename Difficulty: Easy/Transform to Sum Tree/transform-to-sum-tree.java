/* Structure for Tree Node
class Node {
    int data;
    Node left, right;

    // Constructor
    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
};
*/
class Solution {
    public void toSumTree(Node root) {
        // code here
        solve(root);
    }
    public int solve(Node node){
        if(node == null)return 0;
        
        
        int rootval =node.data;
        int leftsum = solve(node.left);
        int rightsum = solve(node.right);
        node.data=leftsum+rightsum;
        return rootval+leftsum+rightsum ;
    }
}