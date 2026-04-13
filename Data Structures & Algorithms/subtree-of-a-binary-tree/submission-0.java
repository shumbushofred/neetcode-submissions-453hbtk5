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
    boolean hh;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
     ans = false;
     travel(root,subRoot);
     return ans;
    }
    public void travel(TreeNode root, TreeNode subRoot){
        
        if(root == null && subRoot != null){
            return;
        }
        if(root == null && subRoot == null){
            ans = true;
            return;
        }
        if(root.val == subRoot.val){
            hh = true;
            comp(root,subRoot);
            //System.out.println("amhere");
            if(hh == true){
                ans = true;
            }
        }
        travel(root.left,subRoot);
        travel(root.right,subRoot);
    }
    public void comp(TreeNode root, TreeNode subRoot){
        if(root == null){
            if (subRoot != null){
                hh = false;
                return;
            }
            return;
        }
        if(subRoot == null){
            if (root != null){
                hh = false;
                return;
            }
            return;
        }
        if(root.val != subRoot.val){
            hh = false;
            return;
        }
        comp(root.left,subRoot.left);
        comp(root.right,subRoot.right);
        
    }
}
