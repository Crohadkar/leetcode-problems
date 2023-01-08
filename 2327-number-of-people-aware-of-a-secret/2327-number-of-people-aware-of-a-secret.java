class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        long[] dp = new long[n+1];
        long ans=0 , mod = (long)1e9 + 7 ,noofsharing=0;
        
        dp[1]=1;
        for(int i=2;i<=n;i++){
            long newshare =dp[Math.max(i-delay,0)];
            long fp = dp[Math.max(i-forget,0)];
            noofsharing +=(newshare - fp +mod)%mod;
            dp[i] = noofsharing;
        }
        for(int i=n-forget+1 ;i<=n;i++)
            ans=(ans+dp[i])%mod;
        
        return (int)ans;
    }
}