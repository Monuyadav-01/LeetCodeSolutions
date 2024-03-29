class Solution {
  public int solve(int nums[] , int target, int dp[]){
    if(target==0){
      return 1;
    }
    if(target<0){
      return 0;
    }
    if(dp[target]!=-1) return dp[target];
    int sum=0;
    for(int i=0;i<nums.length;i++){
      sum+=solve(nums, target-nums[i], dp);
    }
    return sum;
  }
    public int combinationSum4(int[] nums, int target) {
        int dp[] =new int [target+1];
        dp[0] =1;

        for(int i=0;i<=target;i++){
          for(int j=0;j<nums.length;j++){
              if(i-nums[j]>=0){
                dp[i]+=dp[i-nums[j]];
              }
          }
        }
        return  dp[target];

    }
}