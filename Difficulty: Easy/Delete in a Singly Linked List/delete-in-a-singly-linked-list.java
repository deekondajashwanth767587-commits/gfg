/*
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        if(head==null)return null;
        if(x==1)return head.next;
        Node curr= head;
        Node prev=null;
        while(x>1){
            prev=curr;
            curr=curr.next;
            x--;
        }
        prev.next=curr.next;
        return head;
    }
}