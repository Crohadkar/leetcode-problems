class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            set.add(reverse(nums[i]));
        }
        return set.size();
    }
    static int reverse(int num){
        int reversed=0;
         while(num != 0) { 
          int digit = num % 10;
          reversed = reversed * 10 + digit;
          num /= 10;
        }
        return reversed;
    }    
}