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
    public int maxDepth(TreeNode root) {
        ans =0;
        if(root == null){
            return 0;
        }
        helper(root,1);
        return ans;
    }
    public void helper(TreeNode root, int dp){
        if(dp > ans){
            ans = dp;
        }
        if(root == null){
            return;
        }
        if(root.left !=null){
            helper(root.left,dp+1);
        }
        if(root.right !=null){
        helper(root.right,dp+1);
        }
        return;
    }
}
