class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<ArrayList<Integer>> s = new HashSet<>();
        // ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        for(int i =0 ; i<nums.length-2;i++){
            int val = nums[i];
            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                int sum = val + nums[l]+nums[r];
                if(sum==0){
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(val);
                    temp.add(nums[l]);
                    temp.add(nums[r]);
                    l++;
                    r--;
                    s.add(temp);
                }else if(sum<0){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return new ArrayList<>(s);
    }
}