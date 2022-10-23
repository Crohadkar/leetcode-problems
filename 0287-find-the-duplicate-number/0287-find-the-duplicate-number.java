class Solution {
    public int findDuplicate(int[] nums) {
        // int ans=nums[0];
        Arrays.sort(nums);
        int slow =0;
        int fast =1;
        while(nums[slow] != nums[fast]){
            if(nums[slow] == nums[fast]){
                break;
            }
            slow++;
            fast++;
        }
        return nums[slow] ;
        
    }
}