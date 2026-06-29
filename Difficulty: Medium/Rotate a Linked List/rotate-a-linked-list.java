/*
class Node {
    int data;
    Node next;

    Node(int d){
        data=d;
        next=null;
   }
}
*/

class Solution {
    public Node rotate(Node head, int k) {
        // code here
         if(k==0 || head==null || head.next==null)return  head;
     int n=1;
     Node tail =head;
     while(tail.next!=null){
         n++;
         tail=tail.next;
     }
     k=k%n;
     if(k==0)return  head;
     int i=1;
     Node temp=head;
     while(i<k){
         i++;
         temp=temp.next;
     }
     Node newhead=temp.next;
     temp.next=null;
     tail.next=head;
     
     return newhead;
     
         
    }
}