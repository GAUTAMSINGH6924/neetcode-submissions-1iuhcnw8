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
        List<Integer> result=new ArrayList<>();

        Queue<TreeNode>q=new LinkedList<>();
        if(root==null){
            return result;
        }
        q.add(root);

        while(!q.isEmpty()){
            int levelSize=q.size();
            int lastValue=0;

            while(levelSize>0){
                TreeNode node=q.poll();
                lastValue=node.val;
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
                levelSize--;
            }
            result.add(lastValue);
        }
        return result;
    }
}
