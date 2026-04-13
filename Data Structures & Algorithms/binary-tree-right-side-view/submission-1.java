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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();

        Queue<TreeNode> helper = new LinkedList<>();
        if(root == null) return ans;
        helper.add(root);
        while(!helper.isEmpty()){
            int size = helper.size();
            int i =0;
            TreeNode current = null;
            while(i < size){
                current = helper.remove();
                if(current.left != null){
                    helper.add(current.left);
                }
                if(current.right != null){
                    helper.add(current.right);
                }
                i++;
            }
            ans.add(current.val);
        }
        return ans;
    }
}
