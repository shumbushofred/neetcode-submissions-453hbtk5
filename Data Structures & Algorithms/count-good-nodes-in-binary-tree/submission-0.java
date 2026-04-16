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
    int ans;
    public int goodNodes(TreeNode root) {
        ans = 0;
        if(root == null) return ans;
        helper(root,root.val);
        return ans;
    }
    public void helper(TreeNode root, int big){
        if(root == null){
            return;
        }
        if(root.val >= big){
            big = root.val;
            ans++;
        }
        helper(root.right,big);
        helper(root.left,big);
    }
}
