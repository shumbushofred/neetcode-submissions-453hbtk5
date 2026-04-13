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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(-1);
        ListNode curr = ans;
        ListNode l1 = list1;
        ListNode l2 = list2;
        while(l1 != null && l2 != null){
            if(l1.val > l2.val){
             ListNode temp = new ListNode(l2.val);
             curr.next = temp;
             curr = curr.next;
             l2 =l2.next;
            }else{
             ListNode tempp = new ListNode(l1.val);
             curr.next = tempp;
             curr = curr.next;
             l1 = l1.next;
            }
        }
        while(l1 != null){
            ListNode tep = new ListNode(l1.val);
            curr.next = tep;
            curr = curr.next;
            l1 =l1.next;
        }
        while(l2 != null){
            ListNode tp = new ListNode(l2.val);
            curr.next = tp;
            curr = curr.next;
            l2 =l2.next;
        }
       return ans.next;
    }
}