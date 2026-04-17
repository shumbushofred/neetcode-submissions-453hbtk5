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
        int len = 0;
        ListNode current = head;
        while(current != null){
            len++;
            current = current.next;
        }
        int pos = len - n;
        current = head;
        int counter =0;
        while(current != null && counter != pos-1){
            counter++;
            current = current.next;
        }
        if(n==1 && len == 1){
            return head.next;
        }
        if(len == n){
            return head.next;
        }
        // System.out.println(counter +"   "+pos + "  "+current.val);
        if(current.next.next != null){
                    current.next = current.next.next;
                }else{
                    current.next = null;   
                }
                return head;
    }
}
