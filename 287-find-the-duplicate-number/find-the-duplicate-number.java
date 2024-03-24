class Solution {
    public int findDuplicate(int[] nums) {
        boolean taken[] = new boolean[nums.length];
        for(int i : nums){
            if(taken[i]){
                return i;
            }
            else{
                taken[i] = true;
            }
        }
        return -1;
    }
}