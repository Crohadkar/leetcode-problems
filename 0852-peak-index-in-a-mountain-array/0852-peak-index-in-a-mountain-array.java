class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int s=0;
        int e=arr.length;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]>arr[i])return i-1;
        }
    return 1;
    }
}