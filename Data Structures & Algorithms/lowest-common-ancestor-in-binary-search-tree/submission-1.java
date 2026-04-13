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
    List<TreeNode> thep;
    List<TreeNode> theq;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        thep = new ArrayList<>();
        theq = new ArrayList<>();
        ansp(root, p);
        ansq(root,q);
        for(int i = theq.size() -1; i >=0;i--){
            for(int j = thep.size() -1; j >=0;j--){
                if(theq.get(i) == thep.get(j)){
                    return theq.get(i);
                }
            }
        }
        return p;

    }
    public void ansp(TreeNode root, TreeNode p){
        if(root == null){
            return;
        }
        if (root.val == p.val){
            thep.add(root);
            return;
        }
        if(root.val > p.val){
            thep.add(root);
            ansp(root.left, p);
        }else{
            thep.add(root);
            ansp(root.right, p);
        }
    }
        public void ansq(TreeNode root, TreeNode q){
        if(root == null){
            return;
        }
        if (root.val == q.val){
            theq.add(root);
            return;
        }
        if(root.val > q.val){
            theq.add(root);
            ansq(root.left, q);
        }else{
            theq.add(root);
            ansq(root.right, q);
        }
    }
}
