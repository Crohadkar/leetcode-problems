class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> set = new HashSet<>();
        
        if(!helper(p1,p2,set) || !helper(p1,p3,set) ||!helper(p1,p4,set) ||!helper(p2,p3,set)||!helper(p3,p4,set)||!helper(p2,p4,set))return false;
        return set.size()==2?true:false;
    }
    
    boolean helper(int s[],int[] e, Set<Integer> set){
        if(s[0]==e[0] && s[1]==e[1])return false;
        
        int dx =s[0]-e[0]; 
        int dy =s[1]-e[1];
        
        int d = dx*dx +dy*dy;
        set.add(d);
        return true ;
    }
}