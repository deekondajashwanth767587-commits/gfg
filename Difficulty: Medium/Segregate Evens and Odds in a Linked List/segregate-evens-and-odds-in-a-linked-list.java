/* Structure of a link list node
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
    Node divide(Node head) {
        // code here
         Node even_head=null;
         Node even_tail=null;
         Node odd_head=null;
         Node odd_tail =null;
         Node curr = head;
         while(curr!=null){
             Node next= curr.next;
             curr.next=null;
             if(curr.data % 2 == 0){
                 if(even_head==null){
                     even_head=curr;
                     even_tail=curr;
                 }else{
                     even_tail.next=curr;
                     even_tail=curr;
                 }
             }else{
                 if(odd_head==null){
                     odd_head=curr;
                     odd_tail=curr;
                 }else{
                     odd_tail.next=curr;
                     odd_tail=curr;
                 }
             }
             curr = next;
         }
         if(even_head==null){
             return odd_head;
         }
         else if(odd_head==null){
             return even_head;
         }else{
             even_tail.next=odd_head;
             odd_tail.next=null;
         }
         return even_head;
    }
}