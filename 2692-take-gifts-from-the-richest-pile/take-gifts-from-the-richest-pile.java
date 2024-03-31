class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a)); // max heap

        for (int i : gifts) {
            pq.add(i);
        }
        long ans = 0;

        while (k-- > 0) {
            int x = pq.poll();
            pq.offer((int) Math.sqrt(x));
        }
        while (!pq.isEmpty()) {
            ans += pq.poll();
        }
        return ans;
    }
}