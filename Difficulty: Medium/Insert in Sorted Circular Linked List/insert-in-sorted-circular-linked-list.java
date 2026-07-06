/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node sortedInsert(Node head, int data) {
        // code here
        Node newnode = new Node(data);
        if(head== null ){
            newnode.next=newnode;
            return newnode;
        }
        Node temp = head;
        while(true){
            if(temp.data<= data && data<=temp.next.data){
                break;
                
            }
            if(temp.data>temp.next.data){
                if(data>=temp.data || data<=temp.next.data){
                    break;
                }
            }
             temp=temp.next;
             if(temp== head){
            break;
        }
        }
        newnode.next=temp.next;
        temp.next=newnode;
        if(data<head.data){
            head=newnode;
        }
        return head;
        
         
    }
}