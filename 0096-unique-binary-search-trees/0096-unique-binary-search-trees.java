class Solution {
    public int numTrees(int n) {
        return helper(n);
    }
    public int helper(int n){
        int cat[] = new int[n+1];
        cat[0]=cat[1]=1;
        
        for(int i =2 ;i<=n ;++i){
            cat[i]=0;
            
            for(int j=0; j<i;++j){
                cat[i] += cat[j]*cat[i-j-1];
            }
           
        }
         return cat[n];
    }
}