 /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode n1, TreeNode n2) {
        
                ArrayList<TreeNode> path1= new ArrayList<>();
                ArrayList<TreeNode> path2= new ArrayList<>();

                getpath(root , n1 , path1);
                getpath(root , n2 , path2);

                int i=0;
                for(;i<path1.size() && i<path2.size();i++){
                    if(path1.get(i)!= path2.get(i)) break;
                }

                TreeNode lca = path1.get(i-1);
                return lca ;
    }
      public  boolean getpath(TreeNode root ,  TreeNode n , ArrayList<TreeNode> path){
                if(root == null )return false;
                path.add(root);
                if(root.val == n.val) return true;
                if(getpath(root.left, n, path)||getpath(root.right, n, path))  return true;

                path.remove(path.size()-1);
                return false;
            } 
}