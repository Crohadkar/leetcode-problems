class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        //by using sort
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1])
        //         return true;
        // }
        // return false;
        
        //optimize
        //using hashset 
     HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if( h.contains(nums[i]))
                return true;
            
            h.add(nums[i]);
        }    
    return false;
    }
}

 