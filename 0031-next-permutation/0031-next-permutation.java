class Solution {
    public void nextPermutation(int[] nums) {
          if(nums.length<=1) return;
        
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        
        if(i>=0){
            int j=nums.length-1;
            while(nums[i]>=nums[j]) j--;
            swap(nums,i,j);
        }
        
        reverse(nums,i+1,nums.length-1);
        
    }
    
    void swap(int[] ar,int i,int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
    
    void reverse(int[] ar,int i,int j){
        while(i<j){
            swap(ar,i,j);
            i++;
            j--;
        }
    }
    }
