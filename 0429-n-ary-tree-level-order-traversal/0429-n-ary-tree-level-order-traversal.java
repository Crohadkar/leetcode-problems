/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
      List<List<Integer>> ans = new ArrayList<>();
      if(root==null)return ans;
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      List<Integer> temp;
      while(!q.isEmpty()){
        temp =  new ArrayList<>();
        int lsize = q.size();
        for (int i = 0; i < lsize; i++){
            Node node = q.poll();
            temp.add(node.val);
            for(Node f:node.children){
                q.add(f);
            }
        }
       ans.add(temp);           
    }
return ans;
    }
}

 