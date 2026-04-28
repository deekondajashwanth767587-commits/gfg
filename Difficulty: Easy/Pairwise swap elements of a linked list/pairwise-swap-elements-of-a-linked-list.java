/* node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution {
    // Function to pairwise swap elements of a linked list.
    // It should returns head of the modified list
    // in pat cllass work not book
    public Node pairwiseSwap(Node head) {
        // code here
        if(head ==null && head.next== null)return head;
        
        Node prev = null;
        Node temp = head;
        head = head.next;
        while (temp != null && temp.next != null) {
            Node first = temp;
            Node second = temp.next;

            Node nextPair = second.next;
            second.next = first;
            first.next = nextPair;

            if (prev != null) {
                prev.next = second;
            }
            prev = first;
            temp = nextPair;
        }

        return head;
        
        
    }
}