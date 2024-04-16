/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode reverseList(ListNode head) {        
        if(head==null || head.next==null) return head;        
        ListNode newHead=reverseList(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newHead;
    }
    
    public static ListNode findKthNode(ListNode temp, int k){
        while(temp!=null && k>1){
            k--;
            temp=temp.next;
        }
        return temp;
    }
    
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode tempHead=head, prevNode=null;
        
        while(tempHead!=null){
            ListNode kthNode=findKthNode(tempHead,k);
            
            if(kthNode==null) {
                if(prevNode!=null) prevNode.next=tempHead;
                break;
            }
            
            ListNode nextNode=kthNode.next;
            kthNode.next=null;
            
            reverseList(tempHead);
            if(tempHead==head) head=kthNode;
            else prevNode.next=kthNode;
            
            prevNode=tempHead;
            tempHead=nextNode;   
        }
        
        return head;
    }
}