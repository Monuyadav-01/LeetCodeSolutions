class Solution {
    public int fillCups(int[] amount) {
      int sum = 0;
        int max = 0;
        for (int i : amount) {
            max = Math.max(max, i);
            sum += i;
        }

        return Math.max(max, (sum + 1) / 2);
    }
}