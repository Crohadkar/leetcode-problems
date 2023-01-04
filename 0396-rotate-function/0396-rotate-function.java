class Solution {
    public int maxRotateFunction(int[] nums) {
        int f =0, sum=0, n = nums.length ;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            f =f+ i*nums[i];
        }
        int max = f;
        for(int i=n-1;i>0 ;i--){
            max = Math.max(max ,f+sum-(n*nums[i]));
            f= f+sum -(n*nums[i]);
        }
        return max;
    }
}

 