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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>(); 
        if(root == null) return ans ; 
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = true ;   
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> currlevel = new ArrayList<>(); 
            
            while(size-- >0){
                TreeNode cur = q.poll();
                currlevel.add(cur.val);   
                if(cur.left != null)q.add(cur.left);
                if(cur.right != null)q.add(cur.right);                         
            }
            
            if(!flag) Collections.reverse(currlevel);
            ans.add(currlevel);
            flag = !flag ;  
        }
        return ans ;
    }
}