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
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = null;
        if(head.next == null || head.next.next==null){
            return false;
        }else{
        fast = head.next.next;
        }
            
        
        while(slow != null && fast != null){
            if(slow == fast){
                return true;
            }
        if(fast.next == null || fast.next.next==null){
            return false;
        }else{
        fast = fast.next.next;
        slow = slow.next;
        }
        }
        return false;
    }
}
