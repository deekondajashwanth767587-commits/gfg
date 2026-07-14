/* Structure of linked list Node
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/
class Solution {
    public Node removeDuplicates(Node head) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        Node prev=head ;
        Node current=head;
        while(current!=null){
            if(set.contains(current.data)){
                prev.next=current.next;
                
                
            }else{
                set.add(current.data);
                    prev=current;
                     
                     
                }
                current =current.next;
            }
        
        
        
        
        
        return head;
        
    }
}