class Solution {
    public int search(int[] nums, int target) {
        return helper(nums,target,0,nums.length-1);
    }
    public int helper(int nums[],int target , int s , int e){
        while(s<=e){
            int mid = (s+e ) / 2;
            if(nums[mid] == target) return mid; 
            else if(target > nums[mid]) s = mid + 1;
            else e = mid - 1;     
        }
        return -1 ;
    }
    
   
}