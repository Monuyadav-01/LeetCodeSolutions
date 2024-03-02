class Solution {
    public int wiggleMaxLength(int[] nums) {
        if(nums.length < 2){
            return nums.length;
        }
        int cnt = 1;
        int diff =0;

        for(int i = 1 ; i<nums.length;i++){
            int curr_diff = nums[i] - nums[i-1];

            if((curr_diff > 0 && diff <= 0) || (curr_diff <0 && diff >= 0 )){
                cnt++;
                diff = curr_diff;
            }
        }
        return cnt;
    }
}