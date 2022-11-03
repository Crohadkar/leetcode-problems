class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans=0;
        int check=0;
        double x;
        for(int i=0;i<arr1.length;i++){
            check=0;
            for(int j=0;j<arr2.length;j++){
                x=Math.abs(arr1[i]-arr2[j]);
                if(x<=d){
                    j=arr2.length-1;
                }
                else{
                    check++;
                }
            }
            if(check==arr2.length){
                ans++;
            }
        }
        return ans;
     }
}

 