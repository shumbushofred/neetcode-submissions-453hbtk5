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
        if(head == null) return head;
        if(head.next == null) return head;
        ListNode answer = new ListNode(-1);
        ListNode current = answer;
        List<Integer> temp = new ArrayList<>();
        while (head != null){
            temp.add(head.val);
            head = head.next;
        }
        for(int i = temp.size()-1; i >= 0;i--){
            current.next = new ListNode(temp.get(i));
            current = current.next;
        }
        return answer.next;
    }
}
