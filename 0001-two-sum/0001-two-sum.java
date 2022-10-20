class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start =0 ;
        int end = nums.length-1 ;
        int ans[] = new int[2];
        int b[] = Arrays.copyOf(nums , nums.length);
        Arrays.sort(nums);
        while(start < end ){
            int sum = nums[start]+nums[end];
            if(sum == target){
                break ;
            }else if(sum>target){
                end--;
            }else{
                start++ ;
            }
        }
        int startvalue = nums[start];
        int rightvalue = nums[end];
        
        for(int i=0 ; i<nums.length;i++){
            if(b[i]==startvalue){
                ans[0]=i ;
                break;
            }
        }
        for(int i=nums.length-1 ; i>0 ;i--){
            if(b[i]==rightvalue) {
                ans[1]=i ;
                break;
            }
        }
        return ans ;
    }
}