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
    int preIdx=0;
    public int search(int target,int[] inorder,int left,int right){
        for(int i=left;i<=right;i++){
            if(inorder[i]==target){
                return i;
            }
        }
        return -1;
    }
    public TreeNode helper(int[] preorder, int[] inorder,int left,int right){
        if(left>right){
            return null;
        }
        int inidx=search(preorder[preIdx],inorder,left,right);
        TreeNode root=new TreeNode(preorder[preIdx++]);
        root.left=helper(preorder,inorder,left,inidx-1);
        root.right=helper(preorder,inorder,inidx+1,right);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder,inorder,0,inorder.length-1);
    }
}
