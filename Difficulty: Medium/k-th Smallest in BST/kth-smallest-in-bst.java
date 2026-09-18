/*
Definition for Node
class Node {
    int data;
    Node left, right;

    public Node(int val)
    {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    int level =0;
    int result =-1;
    public int kthSmallest(Node root, int k) {
        // code here
        inorder(root , k);
        return result;
    }
    public void inorder(Node node , int k){
        if(node==null)return;
        inorder(node.left , k);
        if(level==k)return ;
        level++;
        if(level==k){
            result = node.data;
            return ;
        }
        inorder(node.right,k);
        
    }
}