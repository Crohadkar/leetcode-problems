class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       ArrayList<Integer> list= new ArrayList<>();
        double ans =0;
        for(int i=0 ; i<nums1.length;i++){
            list.add(nums1[i]);
        }
         for(int i=0 ; i<nums2.length;i++){
            list.add(nums2[i]);
        }
         Collections.sort(list);
        int size = list.size();
         if(size % 2 !=0){
              int temp = (int)Math.ceil(size /2) ;
              ans = list.get(temp);  
         }else{
             int temp = size/2 ;
             ans = list.get(temp)+list.get(temp-1);
             ans /=2 ;
         }
        return ans ;
    }
}