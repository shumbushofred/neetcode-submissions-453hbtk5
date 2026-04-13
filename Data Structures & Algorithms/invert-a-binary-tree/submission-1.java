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
    public TreeNode invertTree(TreeNode root) {
     helper(root);
     return root;
    }
    public void helper(TreeNode root){
        if(root == null) return;
        TreeNode left = (root.left != null)? root.left : null;
        root.left = (root.right != null)? root.right : null;
        root.right = left;
        helper(root.right);
        helper(root.left);
    }
}
