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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null){
            return p==q;
        }

        boolean isLeftOk=isSameTree(p.left, q.left);
        boolean isRightOk=isSameTree(p.right, q.right);

        return isLeftOk && isRightOk && p.val==q.val;
    }
}
