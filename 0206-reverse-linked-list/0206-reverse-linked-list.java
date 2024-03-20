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
    public ListNode reverseList(ListNode head) {
        
        if(head==null) return null;
        
        ListNode starNode = head;
        while(head.next!=null){
            ListNode newNode = head.next;
            head.next=newNode.next;
            newNode.next=starNode;
            starNode=newNode;
        }
        
        return starNode;
    }
}