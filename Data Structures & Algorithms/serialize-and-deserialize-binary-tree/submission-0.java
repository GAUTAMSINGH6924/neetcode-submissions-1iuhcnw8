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

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if(root==null){
            return "";
        }

        Queue<TreeNode>q=new LinkedList<>();
        StringBuilder result=new StringBuilder();
        q.add(root);

        while(!q.isEmpty()){
            TreeNode curr=q.poll();

            if(curr==null){
                result.append("n ");
                continue;
            }
            result.append(curr.val).append(" ");
            q.add(curr.left);
            q.add(curr.right);
        }
        return result.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data==""){
            return null;
        }
        String [] values=data.split(" ");
        Queue<TreeNode>q=new LinkedList<>();
        TreeNode root=new TreeNode(Integer.parseInt(values[0]));
        q.add(root);
        int i=1;
        while(!q.isEmpty() && i<values.length){
            TreeNode parent=q.poll();
            if(!values[i].equals("n")){
                TreeNode left=new TreeNode(Integer.parseInt(values[i]));
                parent.left=left;
                q.add(left);
            }i++;
             if(!values[i].equals("n")){
                TreeNode right=new TreeNode(Integer.parseInt(values[i]));
                parent.right=right;
                q.add(right);
            }i++;
        }
        return root;
    }
}
