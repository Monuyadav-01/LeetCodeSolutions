class Solution {

    public int solve(int n , int dp[]){
        if(n == 0) return 0;
        if(dp[n] != -1) return dp[n];
        int ans = n;
        for(int i =1;i*i<=n;i++){
            int temp = i*i;
            ans = Math.min(ans , 1+solve(n-temp,dp));    
        }
        dp[n] = ans;
        return dp[n];
    } 
    public int numSquares(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        return solve(n,dp);
    }
}