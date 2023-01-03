class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> ans = new ArrayList();
         rec(nums , 0,new ArrayList(),ans);
        return ans ;
    }
     void rec(int[] nums , int j, List<Integer> cur , List<List<Integer>>ans ){
     
        ans.add(new ArrayList(cur));
        for(int i=j ;i<nums.length ;i++){
        
            cur.add(nums[i]);
            rec(nums,i+1,cur,ans);
            cur.remove(cur.size()-1);
      
        }
         

    }
}