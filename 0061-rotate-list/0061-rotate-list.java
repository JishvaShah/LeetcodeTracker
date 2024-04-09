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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null) return null;
        
        int i=1;
        ListNode fast=head, slow=head;
        
        for(i=1;fast.next!=null;i++) fast=fast.next;
        
        k=k%i;
        if(k==0) return head;
        
        for(int j=i-k%i;j>1;j--) slow=slow.next;
        
        ListNode newHead = slow.next;
        slow.next=null;
        fast.next=head;
        
        return newHead;
    }
}