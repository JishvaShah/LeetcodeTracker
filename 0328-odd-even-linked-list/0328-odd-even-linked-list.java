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
        if(head==null || head.next==null) return head;
        
        int count=0;
        ListNode l1head=null;
        ListNode l2head=null;
        ListNode l1dummy=null;
        ListNode l2dummy=null;
        
        while(head!=null){
            if(count%2==0){
                ListNode newNode=new ListNode(head.val);
                if(l1dummy==null){
                    l1dummy=newNode;
                    l1head = l1dummy;
                } 
                else{
                    l1dummy.next=newNode;
                    l1dummy=newNode;
                }
                head=head.next;
            }
            else{
                ListNode newNode=new ListNode(head.val);
                if(l2dummy==null){
                    l2dummy=newNode;
                    l2head = l2dummy;
                } 
                else{
                    l2dummy.next=newNode;
                    l2dummy=newNode;
                }
                head=head.next;
            }
            count++;
        }
        l1dummy.next=l2head;
        return l1head;
    }
}