/*
class Node
{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
*/
class Solution {
    boolean isCircular(Node head) {
        // code here
        // two pointer approach to this problem 
        // fast and slow problem
        if(head==null ||  head.next==null )return false;
        Node fast = head;
        Node slow = head;
        
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            
            if(fast==slow) return true;
             
        }
        return false;
    }
}