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
    static class pair{
        Node node;
        int hd;
       pair(Node node , int hd){
            this.node=node;
            this.hd=hd;
        }
    }
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(root==null )return res;
        Queue<pair> queue = new LinkedList<>();
        TreeMap<Integer , ArrayList<Integer>> map= new TreeMap<>();
        queue.offer(new pair(root , 0));
        while(!queue.isEmpty()){
            pair current = queue.poll();
            Node node = current.node;
            int hd = current.hd;
            map.putIfAbsent(hd, new ArrayList<>());
            map.get(hd).add(node.data);
            if(node.left!=null){
                queue.offer(new pair(node.left , hd-1));
            }
            if(node.right!=null){
                queue.offer(new pair(node.right,hd+1));
                
            }
        }
        for(ArrayList<Integer> l : map.values()){
            res.add(l);
        }
        return res;
    }
}