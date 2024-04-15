/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return head;
        
        //step-1: create deep nodes between original node and it's next.
        Node deepCurr=head;
        while(deepCurr!=null){
            Node deepNode = new Node(deepCurr.val);
            deepNode.next=deepCurr.next;
            deepCurr.next=deepNode;
            deepCurr=deepCurr.next.next;
        }
        
        //step-2: connect deep nodes random pointers
        deepCurr=head;
        while(deepCurr!=null){
            deepCurr.next.random = (deepCurr.random == null) ? null : deepCurr.random.next;
            deepCurr=deepCurr.next.next;
        }
        
        //step-3: Detach deep copy LL from original LL
        Node dummyNode = new Node(-1);
        Node temp=dummyNode;
        deepCurr=head;
        while(deepCurr!=null){
            temp.next=deepCurr.next;
            deepCurr.next=deepCurr.next.next;
            temp=temp.next;
            deepCurr=deepCurr.next;
        }
        
        return dummyNode.next;
    }
}