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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ans = true;
        helper(p,q);
        return ans;
    }
    public void helper(TreeNode p, TreeNode q){
        if(p == null){
            if(q != null){
                ans = false;
                return;
            }else{
                return;
            }
        }
         if(q == null){
            if(p != null){
                ans = false;
                return;
            }else{
                return;
            }
        }
        if(p.val != q.val){
            ans = false;
        }
        helper(p.right,q.right);
        helper(p.left,q.left);
    }
}
