class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            graph.add(new ArrayList<>());
            
        }
        int m= prerequisites.length;
        for(int i=0 ;i<m ;i++){
            graph.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int indegree[] = new int[numCourses];
            for(int i = 0;i<numCourses;i++) {
                    for(Integer it: graph.get(i)) {
                        indegree[it]++;
                    }
                }
         Queue<Integer> q = new LinkedList<Integer>();
                for(int i = 0;i<numCourses;i++) {
                    //adding nodes to queue with indegree = 0
                    if(indegree[i] == 0) {
                        q.add(i);
                    }
                }
                
        ArrayList<Integer> topo = new ArrayList<Integer>();
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            topo.add(node);
            for(Integer it :  graph.get(node)){
                indegree[it]--;
                if(indegree[it]==0)q.add(it);
            }
        }
        
        if(topo.size()==numCourses)return true ;
        return false;
        
    }
    
     
}