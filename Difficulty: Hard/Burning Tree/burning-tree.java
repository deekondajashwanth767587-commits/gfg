/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public int minTime(Node root, int target) {
        // code here
        // in book written 
        Map<Node ,Node > parentmap = new HashMap<>();
        Node targetnode = buildparentmap(root , parentmap, target);
        return burntree(targetnode , parentmap);
    }
    
    private Node buildparentmap(Node root , Map<Node , Node> parentmap , int target){
        
        Queue<Node> queue= new LinkedList<>();
        queue.offer(root);
        Node targetnode = null;
        while(!queue.isEmpty()){
            Node current = queue.poll();
            if(current.data== target)targetnode = current;
            if(current.left!=null){
                parentmap.put(current.left , current);
                queue.offer(current.left);
            }
            if(current.right!=null){
                parentmap.put(current.right, current);
                queue.offer(current.right);
            }
            
        }
        
        
        return targetnode;
        
    }
    private  int burntree(Node targetnode , Map<Node , Node > parentmap){
        int time =0;
        Queue<Node> queue= new LinkedList<>();
        Set<Node> visited = new HashSet<>();
        queue.offer(targetnode);
        visited.add(targetnode);
        while(!queue.isEmpty()){
            int size = queue.size();
            boolean burned = false;
            for(int i=0;i< size;i++){
                Node current = queue.poll();
                
                if(current.left !=null && !visited.contains(current.left)){
                    visited.add(current.left);
                    queue.offer(current.left);
                    burned=true;
                }
                
                if(current.right !=null && !visited.contains(current.right)){
                    visited.add(current.right);
                    queue.offer(current.right);
                    burned=true;
                }
                if(parentmap.containsKey(current) && !visited.contains(parentmap.get(current))){
                    visited.add(parentmap.get(current));
                    queue.offer(parentmap.get(current));
                    burned=true;
                }
                 
            }
            if(burned){
                    time++;
                }
            
        }
        return time;
    }
}