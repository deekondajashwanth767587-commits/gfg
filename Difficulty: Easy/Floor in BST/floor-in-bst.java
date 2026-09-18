/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    int result=-1;
    
    public int findMaxFork(Node root, int k) {
        // code here.
        inorder(root, k);
        return result;
        
    }
    public void inorder(Node root  , int k){
        if(root==null)return;
        inorder(root.left , k);
        
        if(root.data<=k){
            result=root.data;
        }
        inorder(root.right, k);
    }
}