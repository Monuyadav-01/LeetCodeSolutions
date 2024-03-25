class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        for (int num : nums) {
            int index = Math.abs(num) - 1; // map num to index
            if (nums[index] < 0) {
                result.add(Math.abs(num)); // duplicate found
            } else {
                nums[index] = -nums[index]; // mark as visited
            }
        }
        
        return result;
    }
}