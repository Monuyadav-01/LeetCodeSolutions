class Solution {

    public boolean pal(String s , int st , int e){
        while(st <= e){
            if(s.charAt(st) != s.charAt(e) ) return false;
            st++;
            e--;
        }
        return true;
    }

    public int solve(String s , int i , int j,int dp[][]){
        if(i > j) return 0;
        if(i == j) return 1;

        if(dp[i][j] != -1) return dp[i][j];

        if(pal(s, i,j)){
            return dp[i][j] = 1+solve(s , i+1, j,dp ) + solve(s ,i, j-1,dp) - solve(s , i+1, j-1,dp);
        }
        return  dp[i][j] = solve(s , i+1, j,dp) + solve(s ,i, j-1,dp) - solve(s , i+1, j-1,dp);
    }


    public int countSubstrings(String s) {
        int n = s.length();
        int dp[][] = new int[n][n];
        for(int row[]  : dp) Arrays.fill(row, -1);

        return solve(s, 0, n-1, dp);
    }
}