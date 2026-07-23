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

 
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null)return res;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int s = q.size();
            for(int i=0;i<s ;i++){
                Node curr = q.poll();
                if(i==s-1){
                    res.add(curr.data);
                }
                if(curr.left!=null){
                    q.add(curr.left);
                    
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
                
            }
            
        }
        return res;
    }
}
    