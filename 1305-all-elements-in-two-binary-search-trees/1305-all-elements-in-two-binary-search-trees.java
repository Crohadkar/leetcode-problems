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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> ans= new ArrayList<>();
        if(root1== null && root2== null) return ans;
        if(root1 !=null) bfs(root1,ans);
        if(root2 != null)bfs(root2,ans);
        Collections.sort(ans);
        return ans;
    }
    void bfs(TreeNode root ,List<Integer> ans) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            ans.add(cur.val);
            if(cur.left !=null)q.add(cur.left);
            if(cur.right != null)q.add(cur.right);
        }
    }
}