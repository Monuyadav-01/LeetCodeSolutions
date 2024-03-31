class Solution {
    public int[] numberGame(int[] nums) {
       Arrays.sort(nums);
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        int ans[] = new int[n];
        int i = 0;
        int j = 0;
        int k = 2;

        while (i < n) {
            if (st.isEmpty()) {
                while (st.size() != k) {
                    st.push(nums[i]);
                    i++;
                }
            }
            if (st.size() == k) {
                while (!st.isEmpty()) {
                    ans[j] = st.pop();
                    j++;
                }
            }
        }
        return ans; 
    }
}