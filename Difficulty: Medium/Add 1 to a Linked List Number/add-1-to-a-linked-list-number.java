/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node addOne(Node head) {
        // code here.
        head= reverse( head);
        Node current= head;
        int carry =1;
        while(current!=null){
            int digit = current.data;
            int sum = digit+carry;
            current.data=sum%10;
            carry=sum/10;
             if(carry==0)break;
             if(current.next==null && carry>0){
                 current.next=new Node(carry);
                 carry=0;
                 break;
             }
             current=current.next;
        }
         
        head = reverse( head);
        return head;
    }
    public Node  reverse(Node head){
      Node prev=null;
      Node current=head;
      while(current!=null){
          
      
      Node next = current.next;
      current.next=prev;
      prev=current;
      current=next;
      }
      return prev;
    }
}