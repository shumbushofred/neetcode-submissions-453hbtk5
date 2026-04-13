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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> helper = new LinkedList<>();
        if(root == null) return ans;
        helper.add(root);
        while(!helper.isEmpty()){
            int len = helper.size();
            int i =0;
            List<Integer> temp = new ArrayList<>();
            while(i < len){
                TreeNode current = helper.remove();
                temp.add(current.val);
                if(current.left != null){
                    helper.add(current.left);
                }
                 if(current.right != null){
                    helper.add(current.right);
                }
                i++;
            }
            ans.add(new ArrayList<>(temp));
        }
        return ans;
    }
}
