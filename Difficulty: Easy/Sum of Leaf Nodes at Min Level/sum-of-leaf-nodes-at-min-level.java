/* Structure of tree Node
class Node {
  public:
    int data;
    Node left;
    Node right;

    public Node(int x) {
        data = x;
        left = null;
        right = null;
    }
};*/
class Solution {
    public int minLeafSum(Node root) {
        // code here
        if(root == null)return 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int sum=0;
        while(!q.isEmpty()){
             int size= q.size();
              
             boolean flag = false;
            for(int i=0;i< size;i++){
             Node current = q.poll();
             if(current.left==null && current.right==null){
                 sum+=current.data;
                 flag= true;
             } 
                 if(current.left!=null){
                     q.add(current.left);
                 }
                 if(current.right!=null){
                     q.add(current.right);
                 }
             
            }
            if(flag)return sum;
            
        }
        return 0;
        
        
    }
}