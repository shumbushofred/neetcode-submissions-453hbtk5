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
        Stack<Integer> thestack = new Stack<>();
        while(head != null){
            thestack.push(head.val);
            head = head.next;
        }
        ListNode ans = new ListNode(-1);
        ListNode current = ans;
        while(!thestack.isEmpty()){
            ListNode temp = new ListNode(thestack.pop());
            current.next = temp;
            current = current.next; 
        }
        return ans.next;
    }
}
