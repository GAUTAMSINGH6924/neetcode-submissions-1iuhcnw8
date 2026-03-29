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
    int prIndex=0;

    public int search(int [] inorder,int target,int left,int right){
        for(int i=left;i<=right;i++){
            if(inorder[i]==target){
                return i;
            }
        }
        return -1;
    }
    public TreeNode helper(int[] preorder, int[] inorder,int left,int right){
        // base case
        if(left>right){
            return null;
        }

        TreeNode root=new TreeNode(preorder[prIndex++]);
        int inIndex=search(inorder,root.val,left,right);

        root.left=helper(preorder,inorder,left,inIndex-1);
        root.right=helper(preorder,inorder,inIndex+1,right);

        return root;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder,inorder,0,inorder.length-1);
    }
}
