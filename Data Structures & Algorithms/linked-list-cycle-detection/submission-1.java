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
        ListNode current = head;
        ListNode forw = head;
        while(current != null){
            if(forw.next !=null && forw.next.next != null){
                forw = forw.next.next;
                if(forw == current){
                    return true;
                }
            }else{
                return false;
            }
            current = current.next;
        }
        return false;
    }
}
