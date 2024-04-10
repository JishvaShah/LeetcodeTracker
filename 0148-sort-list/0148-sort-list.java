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
    public static ListNode sort(ListNode h1, ListNode h2){
        ListNode dummyNode = new ListNode(-1);
        ListNode res=dummyNode;
        while(h1!=null && h2!=null){
            if(h1.val<h2.val){
                res.next=h1;
                h1=h1.next;
            }
            else {
                res.next=h2;
                h2=h2.next;
            }
            res=res.next;
        }
        if(h1!=null) res.next=h1;
        if(h2!=null) res.next=h2;
        
        return dummyNode.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;
        
        ListNode prev = null, slow = head, fast = head;
        while (fast != null && fast.next != null) {
          prev = slow;
          slow = slow.next;
          fast = fast.next.next;
        }
        prev.next = null;
        
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);

        return sort(l1, l2);
    }
}