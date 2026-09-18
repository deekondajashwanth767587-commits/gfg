/* Structure of a Binary Tree Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    int result =0;
    int count=0;
    public int kthLargest(Node root, int k) {
        // code here
        reverseinorder(root , k);
        return result;
    }
    public void reverseinorder(Node root , int k){
        if(root==null)return ;
        reverseinorder(root.right  , k);
        if(count==k)return;
        count++;
        if(count==k){
            result = root.data;
        }
        reverseinorder(root.left , k);
        
    }
}