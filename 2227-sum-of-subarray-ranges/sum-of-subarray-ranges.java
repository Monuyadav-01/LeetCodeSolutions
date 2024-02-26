class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long ans =0;
        for(int left = 0; left < n;++left){
            int minVal = nums[left];
            int maxVal = nums[left];

            for(int right = left ; right < n;right++){
                minVal = Math.min(minVal , nums[right]);
                maxVal = Math.max(maxVal, nums[right]);

                ans += maxVal - minVal;
            }
        }
        return ans;
    }
}