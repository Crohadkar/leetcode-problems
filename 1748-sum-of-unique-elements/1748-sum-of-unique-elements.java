class Solution {
 
    static int sumOfUnique(int[] nums) {  
        HashMap<Integer,Integer> set = new HashMap<Integer,Integer>();
          for(int i : nums){
            if(set.containsKey(i)){
                set.put(i,set.get(i)+1);
            }else{
                set.put(i,1);
            } 
        }
        int sum=0;
        for(int i=0;i<nums.length;i++)
            if(set.get(nums[i])==1)
                sum=sum+nums[i];
        return sum;
    }
}