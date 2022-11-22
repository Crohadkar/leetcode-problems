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
     List<Integer> list = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
        traverse(root , list) ;
        return list;

    }
      
    public TreeNode traverse(TreeNode root, List<Integer> list) {
           if(root==null){
           return root;
        }
        
          traverse(root.left, list);
            list.add(root.val);
           traverse(root.right, list);
        
        return root;
    }
}