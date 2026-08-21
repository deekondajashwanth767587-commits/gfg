/*Node structure
class Node {
    public int data;
    public Node left, right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};*/

class Solution {
    boolean isPerfect(Node root) {
        // code here
        if(root == null)return true;
        int height =getheight(root);
        int count = total_count(root);
        
        return count ==(1<<height)-1;
    }
    int total_count(Node node){
        if(node==null)return 0;
        else{
            return total_count(node.left)+total_count(node.right)+1;
        }
    }
    int getheight(Node node){
       if(node == null)return 0;
       return 1+ Math.max(getheight(node.left) , getheight(node.right));
    }
};