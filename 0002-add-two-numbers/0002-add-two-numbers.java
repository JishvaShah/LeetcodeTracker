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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0,sum=0;
        
        ListNode temp=null;
        ListNode head=null;
        while(l1!=null || l2!=null || carry==1){
            sum+=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            ListNode newNode = new ListNode(sum%10);
            if(temp==null){
                temp=newNode;
                head = temp;
            } 
            else{
                temp.next=newNode;
                temp=newNode;
            }
            sum=0;
        }
        return head;
    }
}