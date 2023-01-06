class Solution {
    public int numberOfBoomerangs(int[][] points) {
        if(points.length==1)return 0;
        
        HashMap<Integer,Integer> counts = new HashMap<>();
        int res =0 ;
        
        for(int i=0 ;i<points.length;i++){
            for(int j=0;j<points.length;j++){
                if(i==j)continue;
                int dis =getDist(points[i],points[j]);
                counts.put(dis,counts.getOrDefault(dis,0)+1);  
            }
            for(Integer val :counts.values())
                res += val *(val-1);
            
            counts.clear();
        }
        return res;
    }
   
    
    
    int getDist(int s[] ,int e[]){
        int dx =s[0]-e[0]; int dy =s[1]-e[1]; 
        return dx*dx +dy*dy;
    }
}