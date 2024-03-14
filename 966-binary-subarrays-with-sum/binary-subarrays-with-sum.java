class Solution {

    private int helper(int[] nums , int goal){
        int start = 0;
        int currentSum =0;
        int totalCount =0;
        for(int end =0;end < nums.length;end++){
            currentSum+=nums[end];

            while(start <= end && currentSum > goal){
                currentSum -= nums[start++];
            }
            totalCount += end - start + 1;
        }
        return totalCount;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return helper(nums , goal) - helper(nums , goal - 1);
    }
}