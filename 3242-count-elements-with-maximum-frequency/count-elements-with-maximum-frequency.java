class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer , Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i , map.getOrDefault(i , 0) +1);
        }

        int max = 0;
        for(int i : map.values()){
            max = Math.max(max , i);
        }

        int maxFreq = 0;
        for( int freq : map.values()){
            if(freq  == max){
                maxFreq++;
            }
        }
        return maxFreq * max;
    }
}