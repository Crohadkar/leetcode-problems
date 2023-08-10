//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.firstRepChar(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        HashSet<Character> set = new HashSet();

        for(int i=0,j=1;i<s.length();i++,j++){
            if(set.contains(s.charAt(i)))
                return s.charAt(i)+"";
            else set.add(s.charAt(i));
            
                // if(s.charAt(i)==s.charAt(j))
            }
        
        return "-1";
    }
} 