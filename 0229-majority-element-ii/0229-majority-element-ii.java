class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        
        for(int i=0;i<nums.length;i++){
            int count=1 ;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])count++;
            }
            
            if(count > nums.length/3) list.add(nums[i]);
        }
        HashSet < Integer > s = new HashSet < > (list);
        ArrayList<Integer> ans= new ArrayList<>();

        for (int it: s) {
            ans.add(it);
          }
        return ans;
        
    }
}