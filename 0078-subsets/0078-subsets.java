class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> ans = new ArrayList();
         rec(nums , 0,new ArrayList(),ans);
        return ans ;
    }
    public void rec(int[] nums , int i, List<Integer> cur , List<List<Integer>>ans ){
        if(i==nums.length){
            ans.add(new ArrayList(cur));
            return ;
        }
        
        cur.add(nums[i]);
        rec(nums,i+1,cur,ans);
        cur.remove(cur.size()-1);
        rec(nums,i+1,cur,ans);
        
        return;
    }
}