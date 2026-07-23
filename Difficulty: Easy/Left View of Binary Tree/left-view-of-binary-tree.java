/*
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
    public ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
         if(root == null )return result;
        left(root ,0,result );
        
        
        return result;
        
    }
    public void left(Node node ,  int level , ArrayList<Integer> result){
            if(node == null )return ;
            if(level==result.size()){
            result.add(node.data);
        }
        left(node.left, level+1 , result);
        left(node.right , level+1 , result);
    }
}