//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading number of elements and weight
            int n = Integer.parseInt(read.readLine());
            int w = Integer.parseInt(read.readLine());
            
            int val[] = new int[n];
            int wt[] = new int[n];
            
            String st[] = read.readLine().trim().split("\\s+");
            
            //inserting the values
            for(int i = 0; i < n; i++)
              val[i] = Integer.parseInt(st[i]);
             
            String s[] = read.readLine().trim().split("\\s+"); 
            
            //inserting the weigths
            for(int i = 0; i < n; i++)
              wt[i] = Integer.parseInt(s[i]);
              
            //calling method knapSack() of class Knapsack
            System.out.println(new Solution().knapSack(w, wt, val, n));
        }
    }
}




// } Driver Code Ends


class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int w, int wt[], int val[], int n) 
    { 
         // your code here 
         return maxprofit(w,wt,val,0,n,new HashMap<String ,Integer>());
    } 
    static int maxprofit(int w, int wt[], int val[], int curr,int n, HashMap<String,Integer> memo){
        if(curr>=n)return 0;
        
        int curritemweight = wt[curr];
        int curritemprofit = val[curr];
        
        String currkey = Integer.toString(curr)+ "-" +Integer.toString(w);
        if(memo.containsKey(currkey))
            return memo.get(currkey);
        
        int consider =0;
        if(curritemweight <= w)
            consider = curritemprofit + maxprofit(w-curritemweight , wt,val,curr+1,n,memo);
        int notconsider =  maxprofit(w, wt,val,curr+1,n,memo);
        memo.put( currkey,Math.max(consider,notconsider));
        return  memo.get(currkey);
    }
}


