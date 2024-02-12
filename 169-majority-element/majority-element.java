class Solution {
    public int majorityElement(int[] arr) {
          HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : map.keySet()) {
            if (map.get(i) > n / 2) {
                return i;
            }
        }
        return -1;
    }
}