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
 
        }
 *     }
 * }
 */

  class Pair{
        int hd;
        TreeNode node;
        
        public Pair(TreeNode node, int hd){
            this.node=node;
            this.hd =hd;
        }
 }
class Solution {
    
    public List<Integer> rightSideView(TreeNode root) {
        
        ArrayList<Integer> ans = new ArrayList<>(); 
        if(root == null) return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root, 0)); 
        while(!q.isEmpty()) {
            Pair it = q.remove();
            int hd = it.hd; 
            TreeNode temp = it.node; 
            if(map.get(hd) == null) map.put(hd, temp.val); 
           
            if(temp.right != null) {
                
                q.add(new Pair(temp.right, hd + 1)); 
            }
             if(temp.left != null) {
                
                q.add(new Pair(temp.left, hd +1)); 
            }
        }
    
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            ans.add(entry.getValue()); 
        }
        return ans; 
    }
}

// class Tree
// {
//      static class Pair{
//         int hd;
//         Node node;
        
//         public Pair(Node node, int hd){
//             this.node=node;
//             this.hd =hd;
//         }
//     }
//     static ArrayList<Integer> leftView(Node root)
//     {
//         // add your code
        
//         ArrayList<Integer> ans = new ArrayList<>(); 
//         if(root == null) return ans;
//         Map<Integer, Integer> map = new TreeMap<>();
//         Queue<Pair> q = new LinkedList<Pair>();
//         q.add(new Pair(root, 0)); 
//         while(!q.isEmpty()) {
//             Pair it = q.remove();
//             int hd = it.hd; 
//             Node temp = it.node; 
//             if(map.get(hd) == null) map.put(hd, temp.data); 
//             if(temp.left != null) {
                
//                 q.add(new Pair(temp.left, hd +1)); 
//             }
//             if(temp.right != null) {
                
//                 q.add(new Pair(temp.right, hd + 1)); 
//             }
//         }
    
//         for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
//             ans.add(entry.getValue()); 
//         }
//         return ans; 
//     }

// }