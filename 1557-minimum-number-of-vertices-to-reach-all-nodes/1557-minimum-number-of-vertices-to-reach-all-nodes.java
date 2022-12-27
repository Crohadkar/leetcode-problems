class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean vis[] = new boolean[n];
        ArrayList<Integer> ans = new ArrayList<>();
        
       for(int i=0;i<edges.size();i++){
            vis[edges.get(i).get(1)] = true;
        }
        for(int i=0;i<n;i++){
            if(!vis[i])ans.add(i);
        }
        return ans ;
    }
}