class Solution {

        public int maxSum(int arr[] , int k, int dp[] , int start){
            int n = arr.length;
            if(start >= n){
                return 0;
            }
            // return the calculated ans
            if(dp[start] != -1){
                return dp[start];
            }
            int currMax =0;
            int ans =0;
        
            int end = Math.min(n, start+k);
            for(int i =start ;i<end;i++){
                currMax = Math.max(currMax, arr[i]);
                ans = Math.max(ans , currMax*(i-start + 1) + maxSum(arr , k, dp, i+1));
            }

            return dp[start] = ans;
        }


    public int maxSumAfterPartitioning(int[] arr, int k) {
        int dp[] = new int [arr.length];
        Arrays.fill(dp, -1);
        return maxSum(arr , k, dp, 0);
    }
}