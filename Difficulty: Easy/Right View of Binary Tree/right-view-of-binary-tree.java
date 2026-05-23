/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> rightView(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        right(root, 0, result);
        return result;
    }
    public void right(Node root , int level , ArrayList<Integer> result){
        if(root== null)return ;
        if(level==result.size()){
            result.add(root.data);
            
        }
        right(root.right , level+1, result);
        right(root.left , level+1 , result);
        
    }
}