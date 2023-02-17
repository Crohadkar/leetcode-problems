//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.maxSumIS(Arr,n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
	public int maxSumIS(int nums[], int n)  
	{  
	    //code here.
	    int dp[] = new int[nums.length];
        int ans =0 ;
        // Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            dp[i]=nums[i];
            ans = Math.max(ans,dp[i]);
        }

        for(int i=1;i<nums.length ;i++)
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i] = Math.max(dp[i],dp[j]+nums[i]);
                    ans = Math.max(ans,dp[i]);
                }
            }
        
        return ans ;
	}  
}

