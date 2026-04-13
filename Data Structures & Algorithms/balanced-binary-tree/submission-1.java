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
    Boolean ans;
    public boolean isBalanced(TreeNode root) {
        ans = true;
        int ff = helper(root);
        return ans;
    }
    public Integer helper(TreeNode root){
        if(root == null){
            return 1;
        }
        int right= helper(root.right);
        int left = helper(root.left);
        int diff = Math.abs(right -left);
        if(diff > 1){
            ans = false;
        }
        return Math.max(right,left)+1;
    }
}
