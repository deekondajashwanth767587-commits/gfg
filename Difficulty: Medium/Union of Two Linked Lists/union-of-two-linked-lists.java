/*

class Node {
    public int data;
    public Node next;

    public Node(int x) {
        data = x;
        next = null;
    }

}
*/
class Solution {
    public Node makeUnion(Node head1, Node head2) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        Node head = null;
        Node tail= null;
        Node temp = head1;
        
        while(temp!=null){
            if(!set.contains(temp.data)){
                set.add(temp.data);
                Node newNode = new Node(temp.data);
                if(head==null){
                    head=newNode;
                    tail=newNode;
                }else{
                    tail.next=newNode;
                    tail=newNode;
                }
            }
            temp=temp.next;
        }
        temp = head2;
        while(temp!=null){
            if(!set.contains(temp.data)){
                set.add(temp.data);
                Node newNode = new Node(temp.data);
                if(head==null){
                    head=newNode;
                    tail = newNode;
                }else{
                    tail.next=newNode;
                    tail=newNode;
                }
            }
            temp=temp.next;
        }
        return head;
    }
}