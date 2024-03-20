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
        int count=0;
        ListNode dummy = head;
        while(dummy!=null){
            count++;
            dummy=dummy.next;
        }
        
        int pos=count-n;
        if((pos)==0) return head.next;

        ListNode curr = head;
		ListNode prev = null;
        
        int c=0;
		while(curr!=null){
			c++;
			if(c-1==pos){
				prev.next=curr.next;
				curr.next=null;
				break;
			}			
			prev=curr;	
			curr=curr.next;	
		}
		return head;
    }
}