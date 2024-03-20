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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return head;
        
        ListNode l1head=head;
        ListNode l2head=head.next;
        ListNode l2start=head.next;
        
        while(l1head.next!=null && l2head.next!=null){
            l1head.next=l2head.next;
            l1head=l1head.next;
            l2head.next=l1head.next;
            l2head=l2head.next;
        }
        l1head.next=l2start;
        return head;
    }
}