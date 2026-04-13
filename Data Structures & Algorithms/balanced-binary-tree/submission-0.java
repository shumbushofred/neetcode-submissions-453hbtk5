/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    boolean ans;
    public boolean isBalanced(TreeNode root) {
        
    ans = true;
        int temp = helper(root);
        return ans;
    }
    public int helper(TreeNode root){
        if(root == null) return 0;
        int right = helper(root.right) + 1;
        int left = helper(root.left) + 1;
        int num = Math.abs(right - left);
        //System.out.println(right +" "+ left);
        if(num > 1){
            ans = false;
        }
        return Math.max(right,left);
    }
}
