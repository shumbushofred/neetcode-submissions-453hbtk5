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
      if(root == null) return 0;  
      helper(root,1);
      return ans;
    }
    public void helper(TreeNode root,int num){
        if(root == null){
            return;
        }
        if(root != null){
            if(num > ans){
                ans = num;
            }
        }
        helper(root.left,num + 1);
        helper(root.right,num + 1);
        
    }
}
