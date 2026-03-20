/*
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Node> findPreSuc(Node root, int key) {
        // code here
        //in notes 
        ArrayList<Node> res = new ArrayList<>();
        Node pre= null;
        Node succ= null;
        Node curr= root;
       
        while(curr!=null){
            if(curr.data==key){
                  //pre
                if(curr.left!=null){
                    Node temp= curr.left;
                    while(temp.right!=null){
                        temp=temp.right;
                    }
                    pre=temp;
                }
                if(curr.right!=null){
                    Node temp = curr.right;
                    while(temp.left!=null){
                        temp=temp.left;
                    }
                    succ= temp;
                }
                break;
            }else if(key>curr.data){
                pre=curr;
                curr=curr.right;
            }else{
                succ=curr;
                curr=curr.left;
            }
        }
        res.add(pre);
        res.add(succ);
        return res;
        
    }
}