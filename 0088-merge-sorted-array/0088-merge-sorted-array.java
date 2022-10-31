class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        for(int i=0;i<n;i++){
            num1[m++]=num2[i];
        }
        Arrays.sort(num1);
       
    }
}