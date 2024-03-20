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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head, slow=head, temp=head;
        for(int i=0;i<n;i++) fast=fast.next;        
        
        if(fast==null) return head.next;
            
        while(fast!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next;
        }
        
        temp.next=slow.next;
        slow.next=null;        
		return head;
    }
}