class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int totalCnt = 0;
        int currentSum =0;
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num : nums){
            currentSum += num;
            if(currentSum == goal){
                totalCnt++;
            }

            if(freq.containsKey(currentSum - goal)){
                totalCnt += freq.get(currentSum - goal);
            }
            freq.put(currentSum , freq.getOrDefault(currentSum , 0 ) +1);
        }
        return totalCnt;
    }
}