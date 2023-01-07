class Solution {
    public boolean isPossible(int[] nums) {
        HashMap<Integer, Integer> avail = new HashMap<Integer,Integer>();
         HashMap<Integer, Integer> need = new HashMap<Integer,Integer>();
        for(int i:nums){
             avail.put(i, avail.getOrDefault(i,0)+1);
            }
        for(int i:nums){
            if( avail.get(i)<=0){
                continue;
            }else if(need.getOrDefault(i,0)>0){
                avail.put(i,avail.getOrDefault(i,0)-1);
                
                need.put(i,need.getOrDefault(i,0)-1);
                need.put(i+1,need.getOrDefault(i+1,0)+1);
            }
            else if(avail.getOrDefault(i,0)>0 && avail.getOrDefault(i+1,0)>0 &&avail.getOrDefault(i+2,0)>0){
                avail.put(i,avail.getOrDefault(i,0)-1); 
                avail.put(i+1,avail.getOrDefault(i+1,0)-1); 
                avail.put(i+2,avail.getOrDefault(i+2,0)-1);
            
                need.put(i+3,need.getOrDefault(i+3,0)+1);

            }else{
                return false;
            }
        }
        return true ;
    }
}