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
    int ans=0;
    public int averageOfSubtree(TreeNode root) {
        if(root==null)return 0;
        if((sumofNode(root)/countNode(root))== root.val)ans++;
        averageOfSubtree(root.left);
        averageOfSubtree(root.right);
        return ans;
    }
    
      public  int countNode (TreeNode root){
            if(root==null)return 0;
            int lh = countNode(root.left);
            int rh = countNode(root.right);
            return  1+lh+rh;
        }
      public  int sumofNode (TreeNode root){
            if(root==null)return 0;
            int lh = sumofNode(root.left);
            int rh = sumofNode(root.right);
            return  rh+lh+root.val;
        }
}