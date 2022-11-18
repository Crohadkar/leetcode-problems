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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        int leftd= diameterOfBinaryTree(root.left);
        int lefth = height(root.left);
        int rightd= diameterOfBinaryTree(root.right);
        int righth = height(root.right);
        
        int self = lefth + righth;
        
        return Math.max(self , Math.max(leftd,rightd));
    }
     static int height (TreeNode root){
            if(root==null)return 0;
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh,rh)+1;
        }
}