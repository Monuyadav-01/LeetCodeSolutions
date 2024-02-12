class Solution {
    public int majorityElement(int[] nums) {
        
        int ele = 0;
        int cnt = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                ele = nums[i];
                cnt++;
            } else if (ele == nums[i]) {
                cnt++;
            } else {
                cnt--;
            }
        }
        int elementCnt = 0;
        for (int i = 0; i < n; i++) {
            if (ele == nums[i]) {
                elementCnt++;
            }
        }
        if (elementCnt > n / 2) {
            return ele;
        } else {
            return -1;
        }
    }
}