class Solution {
    public int majorityElement(int[] nums) {
        int ans =0 ;
        int count =0 ;
        
        for(int ele : nums){
            if(count==0)ans=ele ;
            if(ele == ans) count++ ;
            if(ele != ans)count--;
        }
         return ans;
    }
}
 
        
   