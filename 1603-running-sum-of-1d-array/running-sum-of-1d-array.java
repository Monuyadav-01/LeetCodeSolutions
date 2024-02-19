class Solution {
    public int[] runningSum(int[] nums) {
         ArrayList<Integer> arr = new ArrayList<>();
        arr.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            int sum = arr.get(i - 1) + nums[i];
            arr.add(sum);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr.get(i);
        }
        return nums;
    }
}