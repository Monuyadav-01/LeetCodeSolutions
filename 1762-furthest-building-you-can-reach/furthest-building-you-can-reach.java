class Solution {
    public int furthestBuilding(int[] h, int b, int l) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,br) -> br - a);
        int i = 0;
        int diff = 0;
        for(i = 0;i<h.length-1;i++){
            diff = h[i + 1] -h[i];
            if(diff <=0){
                continue;
            }
            b= b - diff;
            pq.offer(diff);

            if(b < 0){
                b += pq.poll();
                l--;
            }
            if(l < 0){
                break;
            }
        }
        return i;
    }
}