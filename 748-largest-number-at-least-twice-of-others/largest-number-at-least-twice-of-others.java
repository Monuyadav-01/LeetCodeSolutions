class Solution {
    public int dominantIndex(int[] nums) {

        
        int largest = Integer.MIN_VALUE;
        for (int i : nums) {
            largest = Math.max(i, largest);
        }

        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == largest) {
                index = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != index && 2 * nums[i] > largest) {
                return -1;
            }
        }
        return index;
        
    }
}