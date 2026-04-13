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
    public void reorderList(ListNode head) {
        List<ListNode> arr = new ArrayList<>();
        // System.out.println("am here");
        if(head == null) return;
        if(head.next == null) return;
        ListNode curr = head;
        
        while(curr != null){
            arr.add(curr);
            curr = curr.next;
        }
        
        int i = 0;
        int j = arr.size()-1;
        while(i < j){
            arr.get(i).next = arr.get(j); 
            i++;
            arr.get(j).next = arr.get(i);
            j--;
            if(i >=j){
                break;
            }

        }
        arr.get(i).next = null;
        return;
    }
}
