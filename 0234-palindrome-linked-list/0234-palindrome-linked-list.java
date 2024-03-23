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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head, fast=head;
        //step-1
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null && fast.next==null) slow=slow.next;
        
        //step-2
        ListNode prev=null;
        while(slow!=null){
            ListNode next = slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }
        slow=prev;
        
        //step-3
        fast=head;
        while(fast!=null && slow!=null){
            if(fast.val!=slow.val) return false;
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }
}