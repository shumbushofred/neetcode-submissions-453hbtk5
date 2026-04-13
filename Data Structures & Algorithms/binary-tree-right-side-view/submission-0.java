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
        if(root == null) return ans;
        List<List<Integer>> helper = new ArrayList<>();
        Queue<TreeNode> theq = new LinkedList<>();
        theq.add(root);
        while(!theq.isEmpty()){
            int size = theq.size();
            List<Integer> current = new ArrayList<>();
            for(int i =0; i < size;i++){
                TreeNode temp = theq.remove();
                current.add(temp.val);
                if(temp.left != null){
                    theq.add(temp.left);
                }
                if(temp.right != null){
                    theq.add(temp.right);
                }
            }
            helper.add(new ArrayList<>(current));
        }
        for(int i= 0; i < helper.size();i++){
            ans.add(helper.get(i).get(helper.get(i).size()-1));
        }
        return ans;

    }
}