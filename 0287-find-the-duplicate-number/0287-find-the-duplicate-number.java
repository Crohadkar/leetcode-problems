class Solution {
    public int findDuplicate(int[] nums) {
        int ans=0;
          HashSet<Integer> h = new HashSet<Integer>();
        for(int i:nums){
            if(h.contains(i)){
                return i;
            }else{
                h.add(i);
            }
        }
         return 0;
    }
}