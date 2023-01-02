class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> ans = new ArrayList();
        ans.add(new ArrayList());
        for(int i :nums){
            int n = ans.size();//first take the size of result list because in next loop we update the resultant list 
            for(int j=0 ; j<n;j++){
                List<Integer> temp = new ArrayList(ans.get(j));
                temp.add(i);
                ans.add(temp);
            }
        }
        return ans;
    }
}