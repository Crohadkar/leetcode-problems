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
    int sum=0;
    public int deepestLeavesSum(TreeNode root) {
        int mheight = height(root);
        return func(root,1,mheight);
    }
    
    public int height (TreeNode root){
            if(root==null)return 0;
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh,rh)+1;
        }
    
    public int func(TreeNode root,int count , int mheight){  
        if(count==mheight &&(root.left==null && root.right==null)) sum+=root.val;
        if(count<mheight &&(root.left!=null || root.right!=null)){   
            count++;
            
            if(root.right!=null) func(root.right,count,mheight);  
            if(root.left!=null)  func(root.left,count, mheight);  
            
        }
        return sum;
    }
    
    
}