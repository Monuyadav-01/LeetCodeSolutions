class Solution {
    public int fillCups(int[] amount) {
        int ans =0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i :amount){
            pq.add(i);
        }
        while(pq.peek() != 0){
            int t1= pq.poll();
            int t2 = pq.poll();

            if(t2!=0){
                pq.add(t1-1);
                pq.add(t2-1);
                ans++;
            }
            else{
                return ans + t1;
            }
        }
        return ans;

    }
}