/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        
        ListNode slow = headA, fast = headB;
        
        while(slow!=null || fast!=null){            
            if(slow==fast) return slow;
            slow=(slow!=null)?slow.next:headB;
            fast=(fast!=null)?fast.next:headA; 
        }        
        return slow;
    }
}