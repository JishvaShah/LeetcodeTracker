/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        HashSet<ListNode> hs = new HashSet<>();
        
        if(head==null || head.next==null) return false;
        
        while(!hs.contains(temp) && temp.next!=null){
            hs.add(temp);
            temp=temp.next;
            if(hs.contains(temp.next)) return true;
        }
        return false;
    }
}